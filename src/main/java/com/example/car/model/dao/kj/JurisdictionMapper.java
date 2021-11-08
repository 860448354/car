package com.example.car.model.dao.kj;

import com.example.car.model.pojos.kj.Jurisdiction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JurisdictionMapper {
    List<Jurisdiction> selectAll();
    List<Jurisdiction> selectByrid(Integer rid);
    List<Jurisdiction> selectByrids(@Param("rids") Integer [] integers);
    List<Jurisdiction> selectByridsPlus(@Param("rids") Integer [] integers);
}
