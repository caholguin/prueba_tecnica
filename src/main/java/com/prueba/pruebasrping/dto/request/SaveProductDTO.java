package com.prueba.pruebasrping.dto.request;

import com.prueba.pruebasrping.dto.response.BranchDTO;

import java.io.Serializable;

public class SaveProductDTO implements Serializable {

    private Long id;

    private String name;

    private Integer stock;

    private Long branchId;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getStock(){
        return stock;
    }

    public void setStock(Integer stock){
        this.stock = stock;
    }

    public Long getBranchId(){
        return branchId;
    }

    public void setBranchId(Long branchId){
        this.branchId = branchId;
    }
}
