package com.example.car.model.services.hyj;

import com.example.car.model.dao.hyj.PutStoreMapper;
import com.example.car.model.pojos.hyj.Purchase;
import com.example.car.model.pojos.hyj.PutSto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PutStoreService {
    @Resource
    PutStoreMapper putStoreMapper;
    public List<Purchase> findPurD(){
        return putStoreMapper.findPurD();
    }
    public void editState(Purchase purchase){
        putStoreMapper.editState(purchase);
    }
    public void addPutStore(PutSto putSto){
        putStoreMapper.addPutStore(putSto);
        putStoreMapper.editPutStore(putSto.getPurchase().getPurXq());
        putStoreMapper.editPutStoreState(putSto);
    }
}
