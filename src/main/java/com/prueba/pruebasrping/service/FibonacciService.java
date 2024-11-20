package com.prueba.pruebasrping.service;

import com.prueba.pruebasrping.dto.request.FibonacciDTO;
import com.prueba.pruebasrping.dto.request.SaveFibonacciDTO;

import java.math.BigInteger;
import java.time.LocalTime;
import java.util.List;

public interface FibonacciService {

    List<FibonacciDTO> getAll();

    List<Integer> generateDescendingFibonacci();

    List<Integer> generateDescendingFibonacciWithData(SaveFibonacciDTO saveFibonacciDTO);

}
