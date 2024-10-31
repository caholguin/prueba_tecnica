package com.prueba.pruebasrping.service;

import com.prueba.pruebasrping.dto.request.SaveFranchiseDTO;
import com.prueba.pruebasrping.dto.response.FranchiseDTO;
import com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO;
import com.prueba.pruebasrping.entity.Franchise;

import java.util.List;

public interface FranchiseService {

    FranchiseDTO save(SaveFranchiseDTO saveFranchiseDTO);

    FranchiseDTO update(Long id, SaveFranchiseDTO saveFranchiseDTO);

    Franchise findByIdEntity(Long id);


}
