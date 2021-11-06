package com.example.car.model.dao.hyj;

import com.example.car.model.pojos.hyj.Comm;
import com.example.car.model.pojos.hyj.Store;
import com.example.car.model.pojos.hyj.Supplier;
import com.example.car.model.pojos.kj.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseMapper {
    List<Supplier> findAllSupplier();
    List<Store> findAllStore();
    List<Staff> findCaiGou();
    List<Comm> findCommBySupplierName(Comm c);
}
