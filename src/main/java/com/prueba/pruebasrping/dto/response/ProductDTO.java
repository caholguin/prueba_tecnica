package com.prueba.pruebasrping.dto.response;


import java.io.Serializable;

public class ProductDTO implements Serializable {

    private Long id;

    private String name;

    private Integer stock;

    private BranchDTO branch;

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

    public BranchDTO getBranch(){
        return branch;
    }

    public void setBranch(BranchDTO branch){
        this.branch = branch;
    }

    public static class BranchDTO implements Serializable {
        private Long id;
        private String name;

        public BranchDTO(Long id, String name){
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
