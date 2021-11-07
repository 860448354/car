package com.example.car.model.services.csp;

import com.example.car.model.dao.csp.VendorAccountMapper;
import com.example.car.model.pojos.hyj.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VendorAccountService {
    @Autowired
    VendorAccountMapper vendorAccountMapper;

    public List<Purchase> selPurchase(String supplierName){
        return vendorAccountMapper.selPurchase(supplierName);
    }
}
