package com.example.car.controller.csp;

import com.example.car.model.pojos.csp.ConfirmVo;
import com.example.car.model.pojos.csp.CustomerAccount;
import com.example.car.model.services.csp.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/account")
public class CustomerAccountController {
    @Autowired
    CustomerAccountService customerAccountService;

    @RequestMapping("/sel-confirm")
    public List<ConfirmVo> selConfirm(@RequestBody CustomerAccount customerAccount){
        return customerAccountService.selConfirm(customerAccount.getCrName(),customerAccount.getCarNumber());
    }

    //新增客户结算单
    @RequestMapping("/add-customerAccount")
    public String addCustomerAccount(@RequestBody CustomerAccount customerAccount){
        try{
            System.out.println(customerAccount);
            customerAccountService.addCustomerAccount(customerAccount);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    //查询客户往来账
    @RequestMapping("/sel-customerAccount")
    public List<CustomerAccount> selCustomerAccount(@RequestBody CustomerAccount customerAccount){
        String start  = null;
        String end = null;
        if(customerAccount.getStart() != null && customerAccount.getEnd() != null){
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            start = sf.format(customerAccount.getStart());
            end = sf.format(customerAccount.getEnd());
        }
        return customerAccountService.selCustomerAccount(start,end,customerAccount.getCrName(),customerAccount.getCarNumber());
    }
}
