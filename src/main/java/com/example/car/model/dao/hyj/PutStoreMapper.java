package com.example.car.model.dao.hyj;

import com.example.car.model.pojos.hyj.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PutStoreMapper {
    List<Purchase> findPurD();
    void editState(Purchase purchase);
    void addPutStore(@Param("putSto") PutSto putSto,@Param("storeName")String storeName);
    void addPutXq(@Param("list") List<PurXq> purXq,@Param("putStoId") int putStoId);
    void editPutStoreState(PutSto putSto);
    //void editPutStoreNum(@Param("list") List<PurXq> purXq,@Param("storeId") int storeId);
    void editPutStoreNum(@Param("repeComm") PurXq repeComm,@Param("commSNum") int commSNum,@Param("storeId")int storeId);
    Store findStoreByName(@Param("storeName") String storeName);
    RepeComm deRepeComm(@Param("commName")String commName);
    void addRepeComm(@Param("repeComm") PurXq repeComm,@Param("commSNum")int commSNum,@Param("storeId")int storeId);
}
