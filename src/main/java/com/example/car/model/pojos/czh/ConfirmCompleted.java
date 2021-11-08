package com.example.car.model.pojos.czh;

import com.example.car.model.pojos.kj.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 完工实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmCompleted {
    private Integer ccId;
    private Date completedTime;
    private CarMessage completedCarId;
    private BigDecimal maintenanceAmount;
    private Staff empWx;
}
