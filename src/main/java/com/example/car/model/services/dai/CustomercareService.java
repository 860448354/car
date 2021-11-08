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

import java.util.List;
import java.util.Map;

@Service
public class CustomercareService {
    @Autowired
    CustomercareMapper mapper;

    public Integer insterAllCare(CustomercareVo customercareVo){
        CustomercareVo customercareVoo=new CustomercareVo();
        customercareVoo.setCustId(customercareVo.getCustId());
        customercareVoo.setCustTheme(customercareVo.getCustTheme());
        customercareVoo.setCustTime(customercareVo.getCustTime());
        customercareVoo.setCustContent(customercareVo.getCustContent());
        customercareVoo.setCustState(customercareVo.getCustState());
        customercareVoo.setCustCzrid(customercareVo.getCustCzrid());
        customercareVoo.setCustType(customercareVo.getCustType());
        Integer ins= mapper.insterAllCare(customercareVoo);
        List<Object> list=customercareVo.getFruitesis();
        for(Object object : list) {
            System.out.println("this.is"+object);
            Map entry = (Map)object;
            Integer i = (Integer) entry.get("crId");
            System.out.println("this is"+i);
            Customer customer=new Customer();
            customer.setCrId(i);
            Customercare customercare=new Customercare();
            customercare.setCustId(customercareVoo.getCustId());
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
