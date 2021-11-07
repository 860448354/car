package com.example.car.model.dao.hyj;

import com.example.car.model.pojos.hyj.PurXq;
import com.example.car.model.pojos.hyj.Purchase;
import com.example.car.model.pojos.hyj.PutSto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PutStoreMapper {
    List<Purchase> findPurD();
    void editState(Purchase purchase);
    void addPutStore(PutSto putSto);
    void editPutStore(@Param("list")List<PurXq> purXq);
    void editPutStoreState(PutSto putSto);
}
