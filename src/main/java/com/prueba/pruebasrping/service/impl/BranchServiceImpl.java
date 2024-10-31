package com.prueba.pruebasrping.service.impl;

import com.prueba.pruebasrping.dto.request.SaveBranchDTO;
import com.prueba.pruebasrping.dto.response.BranchDTO;
import com.prueba.pruebasrping.entity.Branch;
import com.prueba.pruebasrping.entity.Franchise;
import com.prueba.pruebasrping.exception.ObjectNotFoundException;
import com.prueba.pruebasrping.mapper.BranchMapper;
import com.prueba.pruebasrping.repository.BranchRespository;
import com.prueba.pruebasrping.service.BranchService;
import com.prueba.pruebasrping.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRespository branchRespository;

    @Autowired
    private FranchiseService franchiseService;

    @Override
    public BranchDTO save(SaveBranchDTO saveCategoryDTO){

        Franchise franchise = franchiseService.findByIdEntity(saveCategoryDTO.getFranchiseId());

        Branch branch = BranchMapper.toEntity(saveCategoryDTO,franchise);

        return BranchMapper.toDto(branchRespository.save(branch));
    }

    @Override
    public BranchDTO update(Long id, SaveBranchDTO saveCategoryDTO){

        Franchise franchise = franchiseService.findByIdEntity(saveCategoryDTO.getFranchiseId());

        Branch branch = this.findByIdEntity(id);

        BranchMapper.updateEntity(branch,saveCategoryDTO,franchise);

        return BranchMapper.toDto(branchRespository.save(branch));
    }

    @Override
    public Branch findByIdEntity(Long id){
        return branchRespository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Sucursal con ID: " + id + " no encontrada"));
    }
}
