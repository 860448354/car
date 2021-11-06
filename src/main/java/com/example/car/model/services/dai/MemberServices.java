package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.MemberMapper;
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
        List<Member> list = mapper.SelectByChoose(member);/*调用查询方法*/
        return new PageInfo<>(list);/*将查询结果封装到PageInfo对象中*/
    }
}
