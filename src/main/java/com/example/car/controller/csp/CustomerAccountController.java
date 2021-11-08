package com.example.car.controller.csp;

import com.example.car.model.pojos.csp.ConfirmVo;
import com.example.car.model.services.csp.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class CustomerAccountController {
    @Autowired
    CustomerAccountService customerAccountService;

    @RequestMapping("/sel-confirm")
    public List<ConfirmVo> selConfirm(){
        return customerAccountService.selConfirm();
    }
}
