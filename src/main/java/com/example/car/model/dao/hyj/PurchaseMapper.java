package com.example.car.model.dao.hyj;

import com.example.car.model.pojos.hyj.Store;
import com.example.car.model.pojos.hyj.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseMapper {
    List<Supplier> findAllSupplier();
    List<Store> findAllStore();
}
