package com.prueba.pruebasrping.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SaveFibonacciDTO implements Serializable {

    LocalTime data;

    public LocalTime getData(){
        return data;
    }

    public void setData(LocalTime data){
        this.data = data;
    }
}
