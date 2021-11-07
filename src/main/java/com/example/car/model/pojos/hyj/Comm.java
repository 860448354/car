package com.example.car.model.pojos.hyj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comm {
    private int commId;
    private String supplierName;
    private String commName;
    private String commSpe;
    private String commCar;
    private String commUnit;
    private double commMoney;
    private int commNum;
    private int CommSNum;
}
