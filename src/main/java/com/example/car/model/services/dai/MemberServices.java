package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.MemberMapper;
import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Member;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServices {
    @Autowired
    MemberMapper mapper;
    /*分页查询*/
    public PageInfo<Member> selectByChoose(Integer pageNo,
                                           Integer pageSize,
                                           Member member){
        PageHelper.startPage(pageNo,pageSize);/*开启分页模式*/
        List<Member> list = mapper.selectByChoose(member);/*调用查询方法*/
        return new PageInfo<>(list);/*将查询结果封装到PageInfo对象中*/
    }
    /*查询所有会员*/
    public List<Member> selectAll(){
        return mapper.selectAll();
    }
    /*分页查询*/
    public PageInfo<Customer> selectByChooseCus(Integer pageNo,
                                                Integer pageSize,
                                                Customer customer){
        PageHelper.startPage(pageNo,pageSize);/*开启分页模式*/
        List<Customer> list = mapper.selectByChooseCus(customer);/*调用查询方法*/
        return new PageInfo<>(list);/*将查询结果封装到PageInfo对象中*/
    }
}
