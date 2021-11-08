package com.example.car.model.dao.dai;

import com.example.car.model.pojos.dai.Caretype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CaretypeMapper {
    /*查询所有类型*/
    List<Caretype> selectAllByType();
}
