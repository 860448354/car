package com.example.car.controller.czh;

import com.example.car.model.pojos.czh.ConfirmCompleted;
import com.example.car.model.services.czh.ConfirmCompletedService;
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

        Integer i = confirmCompletedService.insertCompleted( carMessageId, alMoney, sfId);

        return i;

    }

    /** 查询所有确认完工
     * @return
     */
    @PostMapping("selectCon")
    public List<ConfirmCompleted> selectCon(){
        List<ConfirmCompleted> list = confirmCompletedService.selectComp();
        return list;
    }
}
