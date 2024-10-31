package com.prueba.pruebasrping.dto.response;

import com.prueba.pruebasrping.entity.Branch;

import java.io.Serializable;
import java.util.List;

public class FranchiseDTO implements Serializable {

    private Long id;

    private String name;

    private List<Branch> branchs;

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

    public List<Branch> getBranchs(){
        return branchs;
    }

    public void setBranchs(List<Branch> branchs){
        this.branchs = branchs;
    }
}
