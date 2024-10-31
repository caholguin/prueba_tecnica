package com.prueba.pruebasrping.controller;

import com.prueba.pruebasrping.dto.request.SaveProductDTO;
import com.prueba.pruebasrping.dto.request.UpdateStockDTO;
import com.prueba.pruebasrping.dto.response.ProductDTO;
import com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO;
import com.prueba.pruebasrping.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping()
    public ResponseEntity<ProductDTO> create(@RequestBody SaveProductDTO saveProductDTO) {
        ProductDTO productDTO = productService.save(saveProductDTO);
        return new ResponseEntity<>(productDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable Long id, @RequestBody SaveProductDTO saveProductDTO) {
        ProductDTO productDTO = productService.update(id,saveProductDTO);
        return new ResponseEntity<>(productDTO,HttpStatus.OK);
    }

    @PatchMapping("/stock/{id}")
    public ResponseEntity<ProductDTO> updateStock(@PathVariable Long id, @RequestBody UpdateStockDTO updateStockDTO) {
        ProductDTO productDTO = productService.updateStock(id,updateStockDTO);
        return new ResponseEntity<>(productDTO,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/maxStock/{franchiseId}")
    public List<ProductStockProjectionDTO> getHighestStockProductsByFranchise(@PathVariable Long franchiseId) {
        List<ProductStockProjectionDTO> productStockProjectionDTO =  productService.findProductStockProjectionById(franchiseId);
        return new ResponseEntity<>(productStockProjectionDTO,HttpStatus.OK).getBody();
    }
}
