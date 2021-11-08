package com.example.car.controller.dai;

import com.example.car.model.pojos.dai.Caretype;
import com.example.car.model.services.dai.CaretypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping( "/caretype")
public class CaretypeController {
    @Autowired
    CaretypeService service;
    /*查询所有*/
    @GetMapping("select")
    public List<Caretype> selectByCare(){
        return service.selectAllByType();
    }
}
