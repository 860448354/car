package com.example.car.model.pojos.czh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 车辆信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarMessage {

    private int carMessageId; // 车辆信息主键
    private String carNumber; // 车牌号
    private String carType; // 车辆型号


    private Customer carCust; // 客户车辆关系字段
}
