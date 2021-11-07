package com.example.car.model.services.csp;

import com.example.car.model.dao.csp.VendorAccountMapper;
import com.example.car.model.pojos.csp.VendorAccount;
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

    //查询未审核结算的采购订单
    public List<Purchase> selPurchase(String supplierName){
        return vendorAccountMapper.selPurchase(supplierName);
    }

    //新增供货商结算单
    public void addVendorAccount(VendorAccount vendorAccount){
        vendorAccountMapper.addVendorAccount(vendorAccount);
        vendorAccountMapper.editPurchase(vendorAccount.getSfName(), vendorAccount.getPurOrder());
    }

    //查询供货商往来账
    public List<VendorAccount> selVendorAccount(String start,String end,String supplierName){
        return vendorAccountMapper.selVendorAccount(start, end, supplierName);
    }
}
