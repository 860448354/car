package com.example.car.model.dao.dai;

import com.example.car.model.pojos.dai.Activitytype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivitytypeMapper {
    /*查询所有活动类型*/
    List<Activitytype> selectAllType();
}
