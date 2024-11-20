package com.prueba.pruebasrping.controller;

import com.prueba.pruebasrping.dto.request.FibonacciDTO;
import com.prueba.pruebasrping.dto.request.SaveFibonacciDTO;
import com.prueba.pruebasrping.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("fibonacci")
public class FibonacciController {

    @Autowired
    private FibonacciService fibonacciService;

    @GetMapping
    public ResponseEntity<List<FibonacciDTO>> getAll(){
        return new ResponseEntity<>(fibonacciService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/generate")
    public ResponseEntity<List<Integer>> generateFibonacci(){
        return new ResponseEntity<>(fibonacciService.generateDescendingFibonacci(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Integer>> generateFibonacciWithData(@RequestBody SaveFibonacciDTO saveFibonacciDTO){
        return new ResponseEntity<>(fibonacciService.generateDescendingFibonacciWithData(saveFibonacciDTO), HttpStatus.OK);
    }

}
