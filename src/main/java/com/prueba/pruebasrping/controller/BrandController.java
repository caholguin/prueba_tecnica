package com.prueba.pruebasrping.controller;

import com.prueba.pruebasrping.dto.request.SaveBranchDTO;
import com.prueba.pruebasrping.dto.response.BranchDTO;
import com.prueba.pruebasrping.service.BranchService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branches")
public class BrandController {

    @Autowired
    private BranchService branchService;

    @PostMapping()
    public ResponseEntity<BranchDTO> create(@RequestBody SaveBranchDTO saveBranchDTO) {
        BranchDTO branchDTO = branchService.save(saveBranchDTO);
        return new ResponseEntity<>(branchDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BranchDTO> update(@PathVariable Long id, @RequestBody SaveBranchDTO saveBranchDTO) {
        BranchDTO branchDTO = branchService.update(id,saveBranchDTO);
        return new ResponseEntity<>(branchDTO,HttpStatus.OK);
    }
    
}
