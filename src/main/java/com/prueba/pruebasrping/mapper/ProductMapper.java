package com.prueba.pruebasrping.mapper;

import com.prueba.pruebasrping.dto.request.SaveBranchDTO;
import com.prueba.pruebasrping.dto.request.SaveProductDTO;
import com.prueba.pruebasrping.dto.request.UpdateStockDTO;
import com.prueba.pruebasrping.dto.response.BranchDTO;
import com.prueba.pruebasrping.dto.response.ProductDTO;
import com.prueba.pruebasrping.entity.Branch;
import com.prueba.pruebasrping.entity.Franchise;
import com.prueba.pruebasrping.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public static ProductDTO toDto(Product product) {

        if (product == null) return null;

        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setStock(product.getStock());
        productDTO.setBranch(BranchMapper.toGetBranchDto(product.getBranch()));
        return productDTO;
    }

    public static Product toEntity(SaveProductDTO saveProductDTO, Branch branch) {

        if (saveProductDTO == null) return null;

        Product product = new Product();
        product.setName(saveProductDTO.getName());
        product.setStock(saveProductDTO.getStock());
        product.setBranch(branch);
        return product;
    }

    public static void updateEntity(Product product, SaveProductDTO saveProductDTO, Branch branch){

        if (branch == null || saveProductDTO == null) return;

        product.setName(saveProductDTO.getName());
        product.setStock(saveProductDTO.getStock());
        product.setBranch(branch);
    }

    public static void updateStock(Product product, UpdateStockDTO updateStockDTO){

        if (updateStockDTO == null) return;

        product.setStock(updateStockDTO.getStock());

    }
}
