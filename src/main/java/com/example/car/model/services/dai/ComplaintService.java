package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.ComplaintMapper;
import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Complaint;
import com.example.car.model.pojos.dai.Complainttype;
import com.example.car.model.pojos.dai.Customercare;
import com.example.car.model.pojos.dai.Emergency;
import com.example.car.model.pojos.kj.Staff;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor=Exception.class)
public class ComplaintService {
    @Autowired
    ComplaintMapper mapper;

    /*查询员工*/
    public List<Staff> selectStaff(){
        return mapper.selectStaff();
    }
    /*查询客户*/
    public List<Customer> selectCustomer(){
        return mapper.selectCustomer();
    }
    /*查询紧急程度*/
    public List<Emergency> selectEmer(){
        return mapper.selectEmer();
    }
    /*查询类型*/
    public List<Complainttype> selectType(){
        return mapper.selectType();
    }
    /*新增投诉*/
    public Integer insterComplaint(Complaint complaint){
        return mapper.insterComplaint(complaint);
    }
    /*分页查询*/
    public PageInfo<Complaint> selectByChooseCom(Integer pageNo,
                                                    Integer pageSize,
                                                 Complaint complaint){
        PageHelper.startPage(pageNo,pageSize);/*开启分页模式*/
        List<Complaint> list = mapper.selectByChooseCom(complaint);/*调用查询方法*/
        return new PageInfo<>(list);/*将查询结果封装到PageInfo对象中*/
    }
    /*修改*/
    public Integer updateByCom(Complaint complaint){
        return mapper.updateByCom(complaint);
    }
}
