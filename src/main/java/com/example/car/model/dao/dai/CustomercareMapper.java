package com.example.car.model.dao.dai;

import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Carestaff;
import com.example.car.model.pojos.dai.Customercare;
import com.example.car.vojo.dai.CustomercareVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomercareMapper {
    /*新增客户关怀*/
    Integer insterAllCare(CustomercareVo customercareVo);
    /*新增客户人员*/
    Integer insterByCare(Carestaff carestaff);
    /*分页查询所有的客户关怀*/
    List<Customercare> selectByChooseCus(Customercare customercare);
    /*id查询*/
    List<Carestaff> selectBySta(Integer id);
    /*修改*/
    Integer updateByState(Customercare customercare);
}
