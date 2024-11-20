package com.prueba.pruebasrping.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "fibonacci")
public class Fibonacci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String fibonacci;

    public Fibonacci(Long id, String fibonacci){
        this.id = id;
        this.fibonacci = fibonacci;
    }

    public Fibonacci(){

    }

    public Fibonacci(String fibonacciSequence){
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getFibonacci(){
        return fibonacci;
    }

    public void setFibonacci(String fibonacci){
        this.fibonacci = fibonacci;
    }
}
