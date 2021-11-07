package com.example.car.vojo.czh;

import com.example.car.model.pojos.czh.CarMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarCustVo {

    private int crId; //客户id
    private String crName; //客户姓名
    private String crPhone;//客户电话号
    private String crIdNumber;//客户身份证号
    private String crSex;//客户性别
    private Date crTime;//登记时间
    private List<CarMessage> carMessages;

    private Integer pageNo;
    private Integer pageSize;

}
