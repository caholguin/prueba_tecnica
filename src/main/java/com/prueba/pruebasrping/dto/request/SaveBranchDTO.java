package com.prueba.pruebasrping.dto.request;

import java.io.Serializable;

public class SaveBranchDTO implements Serializable {

    private Long id;

    private String name;

    private Long franchiseId;

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

    public Long getFranchiseId(){
        return franchiseId;
    }

    public void setFranchiseId(Long franchiseId){
        this.franchiseId = franchiseId;
    }
}
