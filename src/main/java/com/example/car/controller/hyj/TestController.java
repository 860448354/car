package com.example.car.controller.hyj;

import com.example.car.model.pojos.hyj.Test;
import com.example.car.model.services.hyj.TestService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class TestController {
    @Resource
    TestService testService;
    @RequestMapping("find")
    public List<Test> find(){
        return testService.find();
    }
}
