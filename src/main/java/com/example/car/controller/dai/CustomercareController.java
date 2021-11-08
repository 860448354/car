package com.example.car.controller.dai;

import com.example.car.model.pojos.dai.Carestaff;
import com.example.car.model.pojos.dai.Customercare;
import com.example.car.model.services.dai.CustomercareService;
import com.example.car.vojo.dai.CustomercareVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping( "/customercare")
public class CustomercareController{
    @Autowired
    CustomercareService services;

    /*新增*/
    @PostMapping("inster")
    public Integer insterAllByC(@RequestBody CustomercareVo customercareVo){
        System.out.println("this is"+customercareVo.toString());
        Integer ins=services.insterAllCare(customercareVo);
        return ins;
    }
    /*分页查询*/
    @GetMapping("search")
    public PageInfo<Customercare> selectBySearch(@ModelAttribute Customercare customercare,
                                           Integer pageNo,
                                           Integer pageSize){
        PageInfo<Customercare> pageQuery=services.selectByChooseCus(pageNo,pageSize,customercare);
        return pageQuery;
    }
    /*根据id查询*/
    @GetMapping("select/{id}")
    public List<Carestaff> selectById(@PathVariable("id") Integer id){
        return services.selectBySta(id);
    }
    /*修改*/
    @PostMapping("uapdate")
    public  Integer updateByState(@RequestBody Customercare customercare){
        System.out.println("this is"+customercare);
        return services.updateByState(customercare);
    }
}
