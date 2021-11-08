package com.example.car.model.pojos.hyj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PutXq {
    private int putXqId;
    private String supplierName;
    private String commName;
    private String commSpe;
    private String commCar;
    private String commUnit;
    private double commMoney;
    private int putStoId;
    private int commNum;
}
