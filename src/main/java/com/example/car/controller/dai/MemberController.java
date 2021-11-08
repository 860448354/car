package com.example.car.controller.dai;

import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Member;
import com.example.car.model.services.dai.MemberService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping( "/member")
public class MemberController {
    @Autowired
    MemberService services;

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
    /*分页*/
    @GetMapping("searches")
    public PageInfo<Customer> selectBySearches(@ModelAttribute Customer customer,
                                           Integer pageNo,
                                           Integer pageSize){
        PageInfo<Customer> pageQuery=services.selectByChooseCus(pageNo,pageSize,customer);
        return pageQuery;
    }
    /*新增会员*/
    @PostMapping("inster")
    public Integer insterAll(@RequestBody Member member){
        Integer ins=services.insterAll(member);
        Integer inn= services.updataByMem(member.getCrId().getCrId());
        return ins;
    }
    /*修改客户基本资料*/
    @PostMapping("updataByCustomer")
    public Integer updataByCustomer(@RequestBody Customer customer){
        System.out.println("this is"+customer);
        return services.updataByCustomer(customer);
    }
    /*查询所有客户*/
    @GetMapping("selectcus")
    public List<Customer> selectAllCus(){
        return services.selectByCus();
    }
}
