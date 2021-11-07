package com.example.car.controller.hyj;

import com.example.car.model.pojos.hyj.Comm;
import com.example.car.model.pojos.hyj.Purchase;
import com.example.car.model.pojos.hyj.Store;
import com.example.car.model.pojos.hyj.Supplier;
import com.example.car.model.pojos.kj.Staff;
import com.example.car.model.services.hyj.PurchaseService;
import com.example.car.util.IdWorker;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("hyj")
public class PurchaseController {
    @Resource
    PurchaseService purchaseService;
    @RequestMapping("getRandom")
    public String getRandom(){
        IdWorker idWorker = new IdWorker(1,1,1);
        String Random = idWorker.nextId()+"";
        return Random;
    }
    @RequestMapping("findAllSupplier")
    public List<Supplier> findAllSupplier() {
        return purchaseService.findAllSupplier();
    }
    @RequestMapping("findAllStore")
    public List<Store> findAllStore(){
        return purchaseService.findAllStore();
    }
    @RequestMapping("findCaiGou")
    public List<Staff> findCaiGou(){
        return purchaseService.findCaiGou();
    }
    @RequestMapping("findCommBySupplierName")
    public List<Comm> findCommBySupplierName(@RequestBody Comm c){
        return purchaseService.findCommBySupplierName(c);
    }
    @RequestMapping("addPur")
    public void addPur(@RequestBody Purchase pur){
        purchaseService.addPur(pur);
    }
    @RequestMapping("findTable")
    public List<Purchase> findTable(){
        return purchaseService.findTable();
    }
    @RequestMapping("findTable2")
    public List<Purchase> findTable2(){
        return purchaseService.findTable2();
    }
}
