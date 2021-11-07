package com.example.car.controller.kj;

import com.example.car.model.pojos.kj.Staff;
import com.example.car.model.services.kj.StaffServices;
import com.example.car.util.MyResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("upda")
    public MyResult staffUpdat(@Param(value = "sid")String sid,@Param(value = "stateid")String stateid){
        System.out.println("拿到的参数"+sid);
        System.out.println("拿到的参数"+stateid);

        MyResult myResult = staffServices.staffUpdate(sid, stateid);
        return myResult;

    }


    @GetMapping("selectDp")
    public List<Staff> selectByDp(){
        List<Staff> list = staffServices.selctListDpId();
        return list;
    }

}
