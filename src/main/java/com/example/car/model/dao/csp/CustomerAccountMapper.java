package com.example.car.model.dao.csp;

import com.example.car.model.pojos.csp.ConfirmVo;
import com.example.car.model.pojos.csp.CustomerAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerAccountMapper {
    //查询未结算的完工修理单
    public List<ConfirmVo> selConfirm(@Param("crName")String crName,@Param("carNumber")String carNumber);

    //新增客户结算单
    public void addCustomerAccount(CustomerAccount customerAccount);

    //查询客户往来账
    public List<CustomerAccount> selCustomerAccount(@Param("start") String start, @Param("end")String end, @Param("crName")String crName,@Param("carNumber")String carNumber);
}
