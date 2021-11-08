package com.example.car.model.pojos.czh;

import com.example.car.model.pojos.hyj.Comm;
import com.example.car.model.pojos.kj.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaintenancePicking {
    private Integer mpId;
    private Integer picking;
    private Comm commPicking;
    private Staff staffPicking;
}
