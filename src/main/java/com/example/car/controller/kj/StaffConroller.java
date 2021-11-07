package com.example.car.controller.kj;

import com.example.car.model.services.kj.StaffServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffConroller {

    @Autowired
    StaffServices staffServices;

    @GetMapping("all")
    public MyResult selectAll(){
        return (staffServices.selectAll());
    }

}
