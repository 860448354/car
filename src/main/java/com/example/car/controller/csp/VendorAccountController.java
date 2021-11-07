package com.example.car.controller.csp;

import com.example.car.model.pojos.csp.VendorAccount;
import com.example.car.model.pojos.hyj.Purchase;
import com.example.car.model.services.csp.VendorAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/account")
public class VendorAccountController {
    @Autowired
    VendorAccountService vendorAccountService;

    //查询未审核结算的采购订单
    @RequestMapping("/vendor-account")
    public List<Purchase> selPurchase(String supplierName){
        return vendorAccountService.selPurchase(supplierName);
    }

    //新增供货商结算单
    @RequestMapping("/add-vendorAccount")
    public String addVendorAccount(@RequestBody VendorAccount vendorAccount){
        try{
            System.out.println(vendorAccount);
            vendorAccountService.addVendorAccount(vendorAccount);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    //查询供货商往来账
    @RequestMapping("/sel-vendorAccount")
    public List<VendorAccount> selVendorAccount(@RequestBody VendorAccount vendorAccount){
        String start  = null;
        String end = null;
        if(vendorAccount.getStart() != null && vendorAccount.getEnd() != null){
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            start = sf.format(vendorAccount.getStart());
            end = sf.format(vendorAccount.getEnd());
        }
        return vendorAccountService.selVendorAccount(start,end,vendorAccount.getSupplierName());
    }
}
