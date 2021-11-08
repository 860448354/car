package com.example.car.controller.czh;

import com.example.car.model.pojos.czh.MaintenanceDispatching;
import com.example.car.model.services.czh.MaintenanceDispatchingService;
import com.example.car.vojo.czh.MaintVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;


@RestController
@RequestMapping("maint")
public class MaintenanceDispatchingController {
    @Autowired
    MaintenanceDispatchingService maintenanceDispatchingService;


    @PostMapping("all")
    public List<MaintenanceDispatching> selectList(@RequestBody MaintVo maintVo){
        List<MaintenanceDispatching> list = maintenanceDispatchingService.selectAllMaint(maintVo);
        return list;
    }

    @PostMapping("insertMaint")
    public Integer insertOnemaint(@RequestBody MaintVo maintVo){
        int i = maintenanceDispatchingService.insertDisp(maintVo);
        return i;
    }

    @GetMapping("updateDis")
    public Integer updatePispat(@RequestParam("money") BigDecimal money,
                                @RequestParam("mdId")Integer mdId){
        System.out.println("这是金额"+money);
        System.out.println("这是主键"+mdId);
        int i = maintenanceDispatchingService.updateDisp(money, mdId);
        return i;
    }
}
