package com.example.car.controller.hyj;

import com.example.car.model.pojos.hyj.Store;
import com.example.car.model.pojos.hyj.Supplier;
import com.example.car.model.pojos.kj.Staff;
import com.example.car.model.services.hyj.PurchaseService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PurchaseController {
    @Resource
    PurchaseService purchaseService;
    @RequestMapping("findAllSupplier")
    public List<Supplier> findAllSupplier() {
        return purchaseService.findAllSupplier();
    }
    @RequestMapping("findAllStore")
    public List<Store> findAllStore(){
        return purchaseService.findAllStore();
    }
    @RequestMapping("findCaiGou")
    public List<Staff> findCaiGou(@RequestBody Staff staff){
        return purchaseService.findCaiGou(staff);
    }
}
