package com.example.car.controller.kj;


import com.example.car.model.services.kj.JurisdictionServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/juris")
public class JurisdictionController {
    @Autowired
    JurisdictionServices jurisdictionServices;

    /**查所有权限
     * @return
     */
    @GetMapping("all")
    public MyResult selectAll(){
        return jurisdictionServices.selectAll();
    }

}
