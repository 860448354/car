package com.example.car.model.dao.kj;

import com.example.car.model.pojos.kj.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffMapper {

    List<Staff>selectAll();
    Integer add(Staff staff);
    Integer userStaffState(Integer stateid,Integer sid);
}
