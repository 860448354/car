package com.example.car.model.dao.csp;

import com.example.car.model.pojos.csp.VendorAccount;
import com.example.car.model.pojos.hyj.Purchase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VendorAccountMapper {
    //查询未审核结算的采购订单
    public List<Purchase> selPurchase(String supplierName);

    //新增供货商结算单
    public void addVendorAccount(VendorAccount vendorAccount);

    //修改采购订单状态
    public void editPurchase(@Param("sfName") String sfName, @Param("purOrder") String purOrder);

    //查询供货商往来账
    public List<VendorAccount> selVendorAccount(@Param("start") String start,@Param("end")String end,@Param("supplierName")String supplierName);
}
