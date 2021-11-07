package com.example.car.controller.dai;

import com.example.car.model.pojos.dai.Activitytype;
import com.example.car.model.services.dai.ActivitytypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping( "/activity")
public class ActivitytypeController {
    @Autowired
    ActivitytypeService service;

    @GetMapping("select")
    public List<Activitytype> selectAllActivity(){
        return service.selectAllType();
    }
}
