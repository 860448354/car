package com.example.car.model.dao.hyj;

import com.example.car.model.pojos.hyj.Store;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RepeMapper {
    List<Store> findRepe(@Param("storeName") String store);
    List<Store> findRe(@Param("storeName") String store);
}
