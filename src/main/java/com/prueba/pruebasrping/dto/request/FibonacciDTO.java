package com.prueba.pruebasrping.dto.request;

import java.io.Serializable;

public class FibonacciDTO implements Serializable {

    private Long Id;

    private String Fibonacci;

    public Long getId(){
        return Id;
    }

    public void setId(Long id){
        Id = id;
    }

    public String getFibonacci(){
        return Fibonacci;
    }

    public void setFibonacci(String fibonacci){
        Fibonacci = fibonacci;
    }
}
