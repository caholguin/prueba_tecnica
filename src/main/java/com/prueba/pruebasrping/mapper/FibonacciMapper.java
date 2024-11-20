package com.prueba.pruebasrping.mapper;

import com.prueba.pruebasrping.dto.request.FibonacciDTO;
import com.prueba.pruebasrping.entity.Fibonacci;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FibonacciMapper {

    public static FibonacciDTO toDto(Fibonacci fibonacci){

        if(fibonacci == null) return null;

        FibonacciDTO fibonacciDTO = new FibonacciDTO();
        fibonacciDTO.setId(fibonacci.getId());
        fibonacciDTO.setFibonacci(fibonacci.getFibonacci());

        return fibonacciDTO;
    }


    public static List<FibonacciDTO> toDtoList(List<Fibonacci> fibonaccis){

        if (fibonaccis == null) return null;

        return fibonaccis.stream()
                .map(FibonacciMapper::toDto)
                .toList();
    }
}
