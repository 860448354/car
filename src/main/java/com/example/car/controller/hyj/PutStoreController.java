package com.example.car.controller.hyj;

import com.example.car.model.pojos.hyj.Purchase;
import com.example.car.model.pojos.hyj.PutSto;
import com.example.car.model.services.hyj.PutStoreService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("hyj")
public class PutStoreController {
    @Resource
    PutStoreService putStoreService;
    @RequestMapping("findPurD")
    public List<Purchase> findPurD(){
        return putStoreService.findPurD();
    }
    @RequestMapping("findPurY")
    public List<Purchase> findPurY(){
        return putStoreService.findPurY();
    }
    @RequestMapping("editState")
    public void editState(@RequestBody Purchase purchase){
        putStoreService.editState(purchase);
    }
    @RequestMapping("addPutStore")
    public void addPutStore(@RequestBody PutSto putSto){
        putStoreService.addPutStore(putSto);
    }
}
