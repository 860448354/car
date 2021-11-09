package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.CustomercareMapper;
import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Activity;
import com.example.car.model.pojos.dai.Actparticipants;
import com.example.car.model.pojos.dai.Carestaff;
import com.example.car.model.pojos.dai.Customercare;
import com.example.car.vojo.dai.ActivityMemberVo;
import com.example.car.vojo.dai.CustomercareVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor=Exception.class)
public class CustomercareService {
    @Autowired
    CustomercareMapper mapper;

    public Integer insterAllCare(CustomercareVo customercareVo){
        Integer ins= mapper.insterAllCare(customercareVo);
        List<Object> list=customercareVo.getFruitesis();
        for(Object object : list) {
            System.out.println("this.is"+object);
            Map entry = (Map)object;
            Integer i = (Integer) entry.get("crId");
            System.out.println("this is"+i);
            Customer customer=new Customer();
            customer.setCrId(i);
            Customercare customercare=new Customercare();
            customercare.setCustId(customercareVo.getCustId());
            Carestaff carestaff=new Carestaff();
            carestaff.setCareCus(customer);
            carestaff.setCareCustom(customercare);
            mapper.insterByCare(carestaff);
        }
        return ins;
    }
    /*新增客户*/
    public Integer insterByCare(Carestaff carestaff){
        return mapper.insterByCare(carestaff);
    }
    /*分页查询*/
    public PageInfo<Customercare> selectByChooseCus(Integer pageNo,
                                                    Integer pageSize,
                                                    Customercare customercare){
        PageHelper.startPage(pageNo,pageSize);/*开启分页模式*/
        List<Customercare> list = mapper.selectByChooseCus(customercare);/*调用查询方法*/
        return new PageInfo<>(list);/*将查询结果封装到PageInfo对象中*/
    }
    /*根据id查询*/
    public List<Carestaff> selectBySta(Integer id){
        return  mapper.selectBySta(id);
    }
    /*修改*/
    public Integer updateByState(Customercare customercare){
        return mapper.updateByState(customercare);
    }
}
