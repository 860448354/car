package com.example.car.model.pojos.hyj;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
    private int purId;
    private String purOrder;
    private String supplierName;
    private String storeName;
    private Date purTime;
    private String sfName;
    private String purPer;
    private Date auditTime;
    private double purMoney;
    private String purRemark;
    private String purName;

}
