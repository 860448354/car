package com.example.car.controller.czh;

import com.example.car.model.pojos.czh.MaintenanceDispatching;
import com.example.car.model.services.czh.MaintenanceDispatchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("maint")
public class MaintenanceDispatchingController {
    @Autowired
    MaintenanceDispatchingService maintenanceDispatchingService;


    @GetMapping("all")
    public List<MaintenanceDispatching> selectList(){
        List<MaintenanceDispatching> list = maintenanceDispatchingService.selectAllMaint();
        return list;
    }
}
