package com.example.car.model.dao.hyj;

import com.example.car.model.pojos.hyj.Purchase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PutStoreMapper {
    List<Purchase> findPurD();
    void editState(Purchase purchase);
}
