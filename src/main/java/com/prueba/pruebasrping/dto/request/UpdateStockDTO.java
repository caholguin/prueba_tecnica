package com.prueba.pruebasrping.dto.request;

import java.io.Serializable;

public class UpdateStockDTO implements Serializable {
    private Integer stock;

    public Integer getStock(){
        return stock;
    }

    public void setStock(Integer stock){
        this.stock = stock;
    }
}
