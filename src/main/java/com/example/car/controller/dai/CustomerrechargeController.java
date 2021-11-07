package com.example.car.controller.dai;

import com.example.car.model.pojos.dai.Customerrecharge;
import com.example.car.model.pojos.dai.Member;
import com.example.car.model.services.dai.CustomerrechargeServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping( "/charge")
public class CustomerrechargeController {
    @Autowired
    CustomerrechargeServices services;
    /*新增*/
    @PostMapping("insterall")
    public MyResult insert(@RequestBody Customerrecharge customerrecharge){
        System.out.println("-------"+customerrecharge.toString());
        /*Customerrecharge charge=new Customerrecharge(
                customerrecharge.getChargeId(),
                customerrecharge.getChargeTime(),
                customerrecharge.getChargeMenoy(),
                customerrecharge.getChargeBalance(),
                customerrecharge.getChargeKhid()
        );
        Integer charges=services.insterAll(charge);*/
        return MyResult.SUCCESS_Object(services.getClass());
    }
    /*修改余额*/
    @PostMapping("updatebym")
    public MyResult updatebyms(@RequestBody Member member){
        Integer charges=services.updayeByMeony(member);
        System.out.println("this is id?"+member);
        return MyResult.SUCCESS_Object(charges.getClass());
    }
    /*查询充值余额记录*/
    @GetMapping("selectall/{id}")
    public List<Customerrecharge> selectAlls(@PathVariable("id") Integer id){
        return services.selectAll(id);
    }
}