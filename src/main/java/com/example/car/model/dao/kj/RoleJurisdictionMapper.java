package com.example.car.model.dao.kj;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleJurisdictionMapper {
    Integer roleJurisdictionAdd(@Param("rid")Integer rid,@Param("juris") Integer[] juris);
}
