package com.example.car.model.pojos.hyj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    private int supplierId;
    private String supplierName;
    private String supplierPer;
    private String supplierPhone;
}
