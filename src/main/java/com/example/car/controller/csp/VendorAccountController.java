package com.example.car.controller.csp;

import com.example.car.model.pojos.hyj.Purchase;
import com.example.car.model.services.csp.VendorAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class VendorAccountController {
    @Autowired
    VendorAccountService vendorAccountService;

    @RequestMapping("/vendor-account")
    public List<Purchase> selPurchase(String supplierName){
        return vendorAccountService.selPurchase(supplierName);
    }
}
