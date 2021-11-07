package com.example.car.controller.dai;

import com.example.car.model.pojos.dai.Member;
import com.example.car.model.services.dai.MemberServices;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping( "/member")
public class MemberController {
    @Autowired
    MemberServices services;

    /*分页联合查询*/
    @GetMapping("search")
    public PageInfo<Member> selectBySearch(@ModelAttribute Member member,
                                           Integer pageNo,
                                           Integer pageSize){
        PageInfo<Member> pageQuery=services.selectByChoose(pageNo,pageSize,member);
        return pageQuery;
    }
    /*查询所有*/
    @GetMapping("selectall")
    public List<Member> selectAllMem(){
        return services.selectAll();
    }
}
