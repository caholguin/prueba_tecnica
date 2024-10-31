package com.prueba.pruebasrping.dto.response;

public class ProductStockProjectionDTO {

    private String product;

    private Integer stock;

    private String brand;

    private String franchise;

    public ProductStockProjectionDTO(String product, Integer stock, String brand, String franchise){
        this.product = product;
        this.stock = stock;
        this.brand = brand;
        this.franchise = franchise;
    }

    public String getProduct(){
        return product;
    }

    public void setProduct(String product){
        this.product = product;
    }

    public Integer getStock(){
        return stock;
    }

    public void setStock(Integer stock){
        this.stock = stock;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getFranchise(){
        return franchise;
    }

    public void setFranchise(String franchise){
        this.franchise = franchise;
    }
}
