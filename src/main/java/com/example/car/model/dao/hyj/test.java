package com.example.car.model.dao.hyj;

import com.example.car.model.pojos.hyj.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface test {
    @Select("select * from test")
    List<Test> find();
}
