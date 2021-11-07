package com.example.car.controller.kj;

import com.example.car.model.pojos.kj.Staff;
import com.example.car.model.services.kj.StaffServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staff")
public class StaffConroller {

    @Autowired
    StaffServices staffServices;

    @GetMapping("all")
    public MyResult selectAll(){
        return (staffServices.selectAll());
    }

    @PostMapping("add")
    public MyResult staffAdd(@RequestBody Staff staff){
        System.out.println("拿到的实体"+staff);
        return staffServices.staffAdd(staff);
    }

}
