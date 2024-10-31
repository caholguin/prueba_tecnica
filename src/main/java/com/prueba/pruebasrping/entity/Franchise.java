package com.prueba.pruebasrping.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "franchise")
public class Franchise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "franchise", cascade = CascadeType.ALL)
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
