package com.example.car.controller.hyj;

import com.example.car.model.pojos.hyj.PutSto;
import com.example.car.model.services.hyj.PutStoLogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("hyj")
public class PutStoLogController {
    @Resource
    PutStoLogService putStoLogService;
    @RequestMapping("findPutStoLog")
    public List<PutSto> findPutStoLog(){
        return putStoLogService.findPutStoLog();
    }
}
