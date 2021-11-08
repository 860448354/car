package com.example.car.model.dao.kj;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StaffRoleMapper {
    Integer staffRoleAdd(@Param("staffid") Integer staid,@Param("roleid") Integer roleid);
    Integer staffRoleDele(@Param("staffid") Integer staid,@Param("roleid") Integer roleid);
}
