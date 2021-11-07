package com.example.car.model.pojos.czh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 客户实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

    private int crId; //客户id
    private String crName; //客户姓名
    private String crPhone;//客户电话号
    private String crIdNumber;//客户身份证号
    private String crSex;//客户性别
    private Date crTime;//登记时间
    private String crMember;

    private List<CarMessage> crCar; //客户车辆关系字段
    private List<MaintenanceDispatching> maintenanceDispatchingSust;

}
