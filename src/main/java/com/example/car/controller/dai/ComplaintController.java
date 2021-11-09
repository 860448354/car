package com.example.car.controller.dai;

import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Complaint;
import com.example.car.model.pojos.dai.Complainttype;
import com.example.car.model.pojos.dai.Customercare;
import com.example.car.model.pojos.dai.Emergency;
import com.example.car.model.pojos.kj.Staff;
import com.example.car.model.services.dai.ComplaintService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping( "/complaint")
public class ComplaintController {
    @Autowired
    ComplaintService service;

    /*查询所有员工*/
    @GetMapping("selectstaff")
    public List<Staff> selectStaff(){
        return service.selectStaff();
    }
    /*查询所有客户*/
    @GetMapping("selectcustomer")
    public List<Customer> selectCustomer(){
        return service.selectCustomer();
    }
    /*查询紧急程度*/
    @GetMapping("selectemer")
    public List<Emergency> selectEmer(){
        return service.selectEmer();
    }
    /*查询类型*/
    @GetMapping("selectType")
    public List<Complainttype> selectType(){
        return service.selectType();
    }
    /*新增投诉记录*/
    @PostMapping("instercomplaint")
    public Integer insterComplaint(@RequestBody Complaint complaint){
        System.out.println("this is"+complaint);
        return service.insterComplaint(complaint);
    }
    /*分页查询selectByChooseCom*/
    @GetMapping("search")
    public PageInfo<Complaint> selectBySearch(@ModelAttribute Complaint complaint,
                                                 Integer pageNo,
                                                 Integer pageSize){
        PageInfo<Complaint> pageQuery=service.selectByChooseCom(pageNo,pageSize,complaint);
        return pageQuery;
    }
    /*修改updateByCom*/
    @PostMapping("update")
    public Integer updateByCom(@RequestBody Complaint complaint){
        return service.updateByCom(complaint);
    }
}
