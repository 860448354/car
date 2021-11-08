package com.example.car.model.pojos.hyj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepeComm {
    private int repeCommId;
    private String supplierName;
    private String repeCommName;
    private String repeCommSpe;
    private String repeCommCar;
    private String repeCommUnit;
    private double repeCommMoney;
    private int repeCommNum;
    private int storeId;
    private List<Store> store;
}
