package com.prueba.pruebasrping.service.impl;

import com.prueba.pruebasrping.dto.request.SaveFranchiseDTO;
import com.prueba.pruebasrping.dto.response.FranchiseDTO;
import com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO;
import com.prueba.pruebasrping.entity.Franchise;
import com.prueba.pruebasrping.entity.Product;
import com.prueba.pruebasrping.exception.ObjectNotFoundException;
import com.prueba.pruebasrping.mapper.FranchiseMapper;
import com.prueba.pruebasrping.repository.FranchiseRepository;
import com.prueba.pruebasrping.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FranchiseServiceImpl implements FranchiseService {

    @Autowired
    private FranchiseRepository franchiseRepository;

    @Override
    public FranchiseDTO save(SaveFranchiseDTO saveCategoryDTO){

        Franchise franchise = FranchiseMapper.toEntity(saveCategoryDTO);

        return FranchiseMapper.toDto(franchiseRepository.save(franchise));
    }

    @Override
    public FranchiseDTO update(Long id, SaveFranchiseDTO saveCategoryDTO){
        Franchise franchise = this.findByIdEntity(id);
        FranchiseMapper.updateEntity(franchise, saveCategoryDTO);

        return FranchiseMapper.toDto(franchiseRepository.save(franchise));
    }


    @Override
    public Franchise findByIdEntity(Long id){
        return franchiseRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("franquicia con ID: " + id + " no encontrada"));
    }


}
