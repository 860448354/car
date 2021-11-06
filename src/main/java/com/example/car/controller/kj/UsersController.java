package com.example.car.controller.kj;


import com.example.car.model.services.kj.UsersServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UsersServices usersServices;

    @GetMapping("login")

    public MyResult selectLogin(String use,String pwd){
        return usersServices.selectLogin(use, pwd);
    }

}
