package com.example.car.model.dao.dai;

import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Complaint;
import com.example.car.model.pojos.dai.Complainttype;
import com.example.car.model.pojos.dai.Customercare;
import com.example.car.model.pojos.dai.Emergency;
import com.example.car.model.pojos.kj.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComplaintMapper {
    /*查询员工*/
     List<Staff> selectStaff();
     /*查询客户*/
     List<Customer> selectCustomer();
     /*查询紧急程度*/
     List<Emergency> selectEmer();
     /*查询投诉类型*/
     List<Complainttype> selectType();
     /*新增投诉记录*/
     Integer insterComplaint(Complaint complaint);
     /*分页查询*/
     List<Complaint> selectByChooseCom(Complaint complaint);
     /*修改*/
     Integer updateByCom(Complaint complaint);
}
