package com.example.car.model.dao.hyj;

import com.example.car.model.pojos.hyj.*;
import com.example.car.model.pojos.kj.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PurchaseMapper {
    List<Supplier> findAllSupplier();
    List<Store> findAllStore();
    List<Staff> findCaiGou();
    List<Comm> findCommBySupplierName(Comm c);
    void addPur(Purchase pur);
    void addPurXq(@Param("purId") int purId,@Param("list") List<PurXq> purXq);
    List<Purchase> findTable();
}
