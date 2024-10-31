package com.prueba.pruebasrping.dto.response;

import com.prueba.pruebasrping.entity.Franchise;
import com.prueba.pruebasrping.entity.Product;

import java.io.Serializable;
import java.util.List;

public class BranchDTO implements Serializable {

    private Long id;

    private String name;

    private FranchiseDTO franchise;

    private List<ProductDTO> products;

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

    public FranchiseDTO getFranchise(){
        return franchise;
    }

    public void setFranchise(FranchiseDTO franchise){
        this.franchise = franchise;
    }

    public List<ProductDTO> getProducts(){
        return products;
    }

    public void setProducts(List<ProductDTO> products){
        this.products = products;
    }

    public static class FranchiseDTO implements Serializable {
        private Long id;
        private String name;

        public FranchiseDTO(Long id, String name){
            this.id = id;
            this.name = name;
        }

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
    }
}
