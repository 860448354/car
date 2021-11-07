package com.example.car.controller.dai;

import com.example.car.model.dao.dai.ActivityMapper;
import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Activity;
import com.example.car.model.pojos.dai.Actparticipants;
import com.example.car.model.pojos.dai.Member;
import com.example.car.model.services.dai.ActivityServices;
import com.example.car.vojo.dai.ActivityMemberVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping( "/activitynew")
public class ActivityController {
    @Autowired
    ActivityServices services;

    /*新增会员活动*/
    @PostMapping("inster")
    public Integer insterAllByActivi(@RequestBody ActivityMemberVo activityMemberVo){
        Integer ins =services.insterAllActvity(activityMemberVo);
        return ins;
    }
    /*分页联合查询*/
    @GetMapping("search")
    public PageInfo<Activity> selectBySearch(@ModelAttribute Activity activity,
                                           Integer pageNo,
                                           Integer pageSize){
        PageInfo<Activity> pageQuery=services.selectByChoose(pageNo,pageSize,activity);
        return pageQuery;
    }
}
