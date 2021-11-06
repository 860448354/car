package com.example.car.controller.czh;

import com.example.car.model.services.czh.CarMessageService;
import com.example.car.model.services.czh.CustomerService;
import com.example.car.vojo.czh.CarCustVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 客户controller
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CarMessageService carMessageService;

    /** 新增客户以及客户车辆信息
     * @param carCustVo
     * @return
     */
        @PostMapping("insertCustAndCar")
    public Integer insertCustomer(@RequestBody CarCustVo carCustVo){
        Integer integer = customerService.insertCust(carCustVo);


        if (integer>0){
            return 1;
        }else{
            return -1;
        }
    }
}
