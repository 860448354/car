package com.example.car.model.dao.kj;

import com.example.car.model.pojos.kj.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Dept>selectAll();
}
