package com.example.car.model.services.hyj;

import com.example.car.model.dao.hyj.PurchaseMapper;
import com.example.car.model.pojos.hyj.*;
import com.example.car.model.pojos.kj.Staff;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurchaseService {
    @Resource
    PurchaseMapper purchaseMapper;
    public List<Supplier> findAllSupplier(){
        return purchaseMapper.findAllSupplier();
    }
    public List<Store> findAllStore(){
        return purchaseMapper.findAllStore();
    }
    public List<Staff> findCaiGou(){
        return purchaseMapper.findCaiGou();
    }
    public List<Comm> findCommBySupplierName(@RequestBody Comm c){
        return purchaseMapper.findCommBySupplierName(c);
    }
    public void addPur(Purchase pur){
        purchaseMapper.addPur(pur);
        purchaseMapper.addPurXq(pur.getPurId(),pur.getPurXq());
    }
    public List<Purchase> findTable(){
        return purchaseMapper.findTable();
    }
    public List<Purchase> findTable2(){
        return purchaseMapper.findTable2();
    }
    public List<Purchase> findPurLikeById(String purOrder){
        return purchaseMapper.findPurLikeById(purOrder);
    }
}
