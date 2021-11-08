package com.example.car.model.dao.kj;

import com.example.car.model.pojos.kj.Role;
import com.example.car.model.pojos.kj.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    Integer add(String name);
    List<Staff>selectAll();
    List<Role> selectBySfid(Integer sfid);
}
