package com.example.car.model.dao.csp;

import com.example.car.model.pojos.hyj.Purchase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VendorAccountMapper {
    public List<Purchase> selPurchase(String supplierName);
}
