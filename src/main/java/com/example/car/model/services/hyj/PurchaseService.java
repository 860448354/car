package com.example.car.model.services.hyj;

import com.example.car.model.dao.hyj.PurchaseMapper;
import com.example.car.model.pojos.hyj.Comm;
import com.example.car.model.pojos.hyj.Store;
import com.example.car.model.pojos.hyj.Supplier;
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
}
