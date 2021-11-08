package com.example.car.controller.czh;

import com.example.car.model.pojos.czh.MaintenancePicking;
import com.example.car.model.services.czh.MaintenancePickingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 维修派工controller
 */
@RestController
@RequestMapping("picking")
public class MaintnancePickingController {

    @Autowired
    MaintenancePickingService maintenancePickingService;


    /** x新增派工记录
     * @param mdId
     * @param lpId
     * @param pickingNum
     * @return
     */
    @GetMapping("insertPick")
    public Integer insertPicking(@RequestParam("mdId") Integer mdId,
                                 @RequestParam("lpId") Integer lpId,
                                 @RequestParam("pickingNum") Integer pickingNum){

        Integer i = maintenancePickingService.insertPicking(mdId, lpId, pickingNum);

                return i;

    }


    /**
     * @return 查询派工
     */
    @PostMapping("selectList")
    public List<MaintenancePicking> selectListPick(){

        List<MaintenancePicking> list = maintenancePickingService.selectList();
        return list;
    }
}
