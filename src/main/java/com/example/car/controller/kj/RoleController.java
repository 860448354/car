package com.example.car.controller.kj;

import com.example.car.model.dao.kj.RoleMapper;
import com.example.car.model.services.kj.RoleServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleServices roleServices;

    @PostMapping("add")
    public MyResult addRole(@RequestParam("name")String name){
        return roleServices.addRole(name);
    }

    @GetMapping("all")
    public MyResult selectAll(){
        return roleServices.selectRole();
    }

    @GetMapping("sfid")
    public MyResult selectBysfid(Integer sfid){
        return roleServices.selectByuid(sfid);
    }



}
