package com.prueba.pruebasrping.mapper;

import com.prueba.pruebasrping.dto.request.SaveBranchDTO;
import com.prueba.pruebasrping.dto.response.BranchDTO;
import com.prueba.pruebasrping.dto.response.ProductDTO;
import com.prueba.pruebasrping.entity.Branch;
import com.prueba.pruebasrping.entity.Franchise;
import org.springframework.stereotype.Component;

@Component
public class BranchMapper {

    public static BranchDTO toDto(Branch branch) {

        if (branch == null) return null;

        BranchDTO branchDTO = new BranchDTO();
        branchDTO.setId(branch.getId());
        branchDTO.setName(branch.getName());
        branchDTO.setFranchise(FranchiseMapper.toGetFranchiseDto(branch.getFranchise()));
        return branchDTO;
    }

    public static Branch toEntity(SaveBranchDTO saveBranchDTO,Franchise franchise) {

        if (saveBranchDTO == null) return null;

        Branch branch = new Branch();
        branch.setName(saveBranchDTO.getName());
        branch.setFranchise(franchise);
        return branch;
    }


    public static void updateEntity(Branch branch, SaveBranchDTO saveBranchDTO, Franchise franchise){

        if (branch == null || saveBranchDTO == null) return;

        branch.setName(saveBranchDTO.getName());
        branch.setFranchise(franchise);
    }

    public static ProductDTO.BranchDTO toGetBranchDto(Branch branch){
        if (branch == null ) return null;

        return new ProductDTO.BranchDTO(
                branch.getId(),
                branch.getName()
        );

    }
}
