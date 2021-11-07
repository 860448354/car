package com.example.car.controller.czh;

import com.example.car.model.pojos.czh.MaintenanceDispatching;
import com.example.car.model.services.czh.MaintenanceDispatchingService;
import com.example.car.vojo.czh.MaintVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("insertMaint")
    public Integer insertOnemaint(@RequestBody MaintVo maintVo){
        int i = maintenanceDispatchingService.insertDisp(maintVo);
        return i;
    }
}
