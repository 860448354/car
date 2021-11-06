package com.example.car.model.pojos.hyj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurXq {
    private int purXqId;
    private int purId;
    private String supplierName;
    private String commName;
    private String commSpe;
    private String commCar;
    private String commUnit;
    private double commMoney;
    private int commNum;
}
