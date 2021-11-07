package com.example.car.controller.hyj;

import com.example.car.model.pojos.hyj.RepeComm;
import com.example.car.model.pojos.hyj.Store;
import com.example.car.model.services.hyj.RepeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("hyj")
public class RepeController {
    @Resource
    RepeService repeService;
    @RequestMapping("findRepe")
    public List<Store> findRepe(String store){
        System.err.println(store);
        return repeService.findRepe(store);
    }
    @RequestMapping("findRe")
    public List<Store> findRe(String store){
        return repeService.findRe(store);
    }
}
