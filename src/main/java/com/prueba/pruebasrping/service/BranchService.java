package com.prueba.pruebasrping.service;

import com.prueba.pruebasrping.dto.request.SaveBranchDTO;
import com.prueba.pruebasrping.dto.response.BranchDTO;
import com.prueba.pruebasrping.entity.Branch;


public interface BranchService {

    BranchDTO save(SaveBranchDTO saveBranchDTO);

    BranchDTO update(Long id, SaveBranchDTO saveBranchDTO);

    Branch findByIdEntity(Long id);
}
