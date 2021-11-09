package com.example.car.controller.czh;

import com.example.car.model.pojos.czh.ConfirmCompleted;
import com.example.car.model.services.czh.ConfirmCompletedService;
import com.example.car.vojo.czh.ComVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 完工记录controller
 */
@RestController
@RequestMapping("comple")
public class ConfirmCompletedController {
    @Autowired
    ConfirmCompletedService confirmCompletedService;


    /** 新增完工记录
     *
     * @param carMessageId
     * @param alMoney
     * @param sfId
     * @return
     */
    @GetMapping("insertComp")
    public Integer insertConfir( @RequestParam("carMessageId") int carMessageId,
                                @RequestParam("alMoney") BigDecimal alMoney,
                                @RequestParam("sfId") int sfId){
        System.out.println("carMessageId"+carMessageId);
        Integer i = confirmCompletedService.insertCompleted( carMessageId, alMoney, sfId);

        return i;

    }

    /** 查询所有确认完工
     * @return
     */
    @PostMapping("selectCon")
    public List<ConfirmCompleted> selectCon(@RequestBody ComVo comVo){
        System.out.println(comVo.getCarNumber()+"这是车牌号");
        System.out.println(comVo.getCarType()+"这是车辆类型");
        System.out.println(comVo.getStaffName()+"这是维修人");
        List<ConfirmCompleted> list = confirmCompletedService.selectComp(comVo);
        return list;
    }
}
