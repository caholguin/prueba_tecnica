package com.prueba.pruebasrping.mapper;

import com.prueba.pruebasrping.dto.request.SaveFranchiseDTO;
import com.prueba.pruebasrping.dto.response.BranchDTO;
import com.prueba.pruebasrping.dto.response.FranchiseDTO;
import com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO;
import com.prueba.pruebasrping.entity.Franchise;
import com.prueba.pruebasrping.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FranchiseMapper {

    public static FranchiseDTO toDto(Franchise franchise) {

        if (franchise == null) return null;

        FranchiseDTO franchiseDTO = new FranchiseDTO();
        franchiseDTO.setId(franchise.getId());
        franchiseDTO.setName(franchise.getName());
        return franchiseDTO;
    }

    public static Franchise toEntity(SaveFranchiseDTO saveFranchiseDTO) {

        if (saveFranchiseDTO == null) return null;

        Franchise franchise = new Franchise();
        franchise.setName(saveFranchiseDTO.getName());
        return franchise;
    }


    public static void updateEntity(Franchise franchise, SaveFranchiseDTO saveFranchiseDTO){

        if (franchise == null || saveFranchiseDTO == null) return;

        franchise.setName(saveFranchiseDTO.getName());
    }

    public static BranchDTO.FranchiseDTO toGetFranchiseDto(Franchise franchise){
        if (franchise == null ) return null;

        return new BranchDTO.FranchiseDTO(
                franchise.getId(),
                franchise.getName()
        );

    }

    public static ProductStockProjectionDTO toProductStockDTO(Product product) {
        if (product == null) return null;

        return new ProductStockProjectionDTO(
                product.getName(),
                product.getStock(),
                product.getBranch().getName(),
                product.getBranch().getFranchise().getName()
        );
    }

    public static List<ProductStockProjectionDTO> toProductStockDTOList(List<Product> products) {
        return products.stream()
                .map(FranchiseMapper::toProductStockDTO)
                .collect(Collectors.toList());
    }
}
