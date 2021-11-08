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
    public List<Purchase> findPurY(){
        return putStoreMapper.findPurY();
    }
    public void editState(Purchase purchase){
        putStoreMapper.editState(purchase);
    }
    public void addPutStore(PutSto putSto){
        putStoreMapper.addPutStore(putSto,putSto.getPurchase().getStoreName());
        putStoreMapper.addPutXq(putSto.getPurchase().getPurXq(), putSto.getPutStoId());
        putStoreMapper.editPutStoreState(putSto);
        for (int i = 0; i < putSto.getPurchase().getPurXq().size(); i++) {
            if (putStoreMapper.deRepeComm(putSto.getPurchase().getPurXq().get(i).getCommName()) == null) {
                putStoreMapper.addRepeComm(putSto.getPurchase().getPurXq().get(i),putSto.getPurchase().getPurXq().get(i).getCommSNum(),putStoreMapper.findStoreByName(putSto.getPurchase().getStoreName()).getStoreId());
            }else {
                putStoreMapper.editPutStoreNum(putSto.getPurchase().getPurXq().get(i),putSto.getPurchase().getPurXq().get(i).getCommSNum(),putStoreMapper.findStoreByName(putSto.getPurchase().getStoreName()).getStoreId());
            }
        }

    }
}
