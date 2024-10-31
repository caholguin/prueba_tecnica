package com.prueba.pruebasrping.service.impl;

import com.prueba.pruebasrping.dto.request.SaveProductDTO;
import com.prueba.pruebasrping.dto.request.UpdateStockDTO;
import com.prueba.pruebasrping.dto.response.ProductDTO;
import com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO;
import com.prueba.pruebasrping.entity.Branch;
import com.prueba.pruebasrping.entity.Product;
import com.prueba.pruebasrping.exception.ObjectNotFoundException;
import com.prueba.pruebasrping.mapper.ProductMapper;
import com.prueba.pruebasrping.repository.ProductRepository;
import com.prueba.pruebasrping.service.BranchService;
import com.prueba.pruebasrping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BranchService branchService;

    @Override
    public ProductDTO save(SaveProductDTO saveProductDTO){
        Branch branch = branchService.findByIdEntity(saveProductDTO.getBranchId());

        Product product = ProductMapper.toEntity(saveProductDTO,branch);

        return ProductMapper.toDto(productRepository.save(product));
    }

    @Override
    public ProductDTO update(Long id, SaveProductDTO saveProductDTO){
        Branch branch = branchService.findByIdEntity(saveProductDTO.getBranchId());

        Product product = this.findByIdEntity(id);

        ProductMapper.updateEntity(product,saveProductDTO,branch);

        return ProductMapper.toDto(productRepository.save(product));
    }

    @Override
    public ProductDTO updateStock(Long id, UpdateStockDTO updateStockDTO){
        Product product = this.findByIdEntity(id);

        ProductMapper.updateStock(product,updateStockDTO);

        return ProductMapper.toDto(productRepository.save(product));
    }

    @Override
    public Product findByIdEntity(Long id){
        return productRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Producto con ID: " + id + " no encontrada"));
    }

    @Override
    public void delete(Long id){
        Product product = this.findByIdEntity(id);
        productRepository.delete(product);
    }

    @Override
    public List<ProductStockProjectionDTO> findProductStockProjectionById(Long id) {
        return productRepository.findHighestStockProductByBranchForFranchise(id);
    }
}
