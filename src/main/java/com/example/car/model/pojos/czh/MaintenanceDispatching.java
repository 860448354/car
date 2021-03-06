package com.example.car.model.pojos.czh;

import com.example.car.model.pojos.kj.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 维修派工实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaintenanceDispatching {
         private  int mdId;
         private  String dispatchingState;
         private Date dispatchingTime;
         private BigDecimal moneyMaint;
         private BigDecimal materialCost;
         private Customer customer;
         private CarMessage carMessage;
         private Staff staff;


}
