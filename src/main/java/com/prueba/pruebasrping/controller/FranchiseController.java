package com.prueba.pruebasrping.controller;

import com.prueba.pruebasrping.dto.request.SaveFranchiseDTO;
import com.prueba.pruebasrping.dto.response.FranchiseDTO;
import com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO;
import com.prueba.pruebasrping.service.FranchiseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/franchises")
public class FranchiseController {

    @Autowired
    private FranchiseService franchiseService;

    @PostMapping()
    public ResponseEntity<FranchiseDTO> create(@RequestBody SaveFranchiseDTO saveFranchiseDTO) {
        FranchiseDTO franchiseDto = franchiseService.save(saveFranchiseDTO);
        return new ResponseEntity<>(franchiseDto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FranchiseDTO> update(@PathVariable Long id, @RequestBody SaveFranchiseDTO saveFranchiseDTO) {
        FranchiseDTO franchiseDTO = franchiseService.update(id,saveFranchiseDTO);
        return new ResponseEntity<>(franchiseDTO,HttpStatus.OK);
    }



}
