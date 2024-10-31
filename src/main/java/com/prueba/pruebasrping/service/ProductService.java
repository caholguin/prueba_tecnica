package com.prueba.pruebasrping.service;

import com.prueba.pruebasrping.dto.request.SaveProductDTO;
import com.prueba.pruebasrping.dto.request.UpdateStockDTO;
import com.prueba.pruebasrping.dto.response.ProductDTO;
import com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO;
import com.prueba.pruebasrping.entity.Product;

import java.util.List;

public interface ProductService {
    
    ProductDTO save(SaveProductDTO saveProductDTO);

    ProductDTO update(Long id, SaveProductDTO saveProductDTO);

    ProductDTO updateStock(Long id, UpdateStockDTO updateStockDTO);

    Product findByIdEntity(Long id);
    
    void delete(Long id);

    List<ProductStockProjectionDTO> findProductStockProjectionById(Long id);
}
