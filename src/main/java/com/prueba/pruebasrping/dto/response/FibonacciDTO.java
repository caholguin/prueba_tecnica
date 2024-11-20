package com.prueba.pruebasrping.dto.response;

import java.io.Serializable;
import java.util.List;

public class FibonacciDTO implements Serializable {

    List<Integer> fibonacci;

    public List<Integer> getFibonacci(){
        return fibonacci;
    }

    public void setFibonacci(List<Integer> fibonacci){
        this.fibonacci = fibonacci;
    }
}
