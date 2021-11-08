package com.example.car.controller.czh;

import com.example.car.model.services.czh.MaintenancePickingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("picking")
public class MaintnancePickingController {

    @Autowired
    MaintenancePickingService maintenancePickingService;


    @GetMapping("insertPick")
    public Integer insertPicking(@RequestParam("mdId") Integer mdId,
                                 @RequestParam("lpId") Integer lpId,
                                 @RequestParam("pickingNum") Integer pickingNum){

        Integer i = maintenancePickingService.insertPicking(mdId, lpId, pickingNum);

                return i;

    }
}
