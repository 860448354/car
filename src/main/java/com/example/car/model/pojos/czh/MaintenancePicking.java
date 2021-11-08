package com.example.car.model.pojos.czh;

import com.example.car.model.pojos.hyj.Comm;
import com.example.car.model.pojos.hyj.RepeComm;
import com.example.car.model.pojos.kj.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 维修领料实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaintenancePicking {
    private Integer mpId;
    private Integer pickingNum;
    private RepeComm commPicking;
    private MaintenanceDispatching dispatching;
}
