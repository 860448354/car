package com.example.car.model.services.hyj;

import com.example.car.model.dao.hyj.RepeMapper;
import com.example.car.model.pojos.hyj.Store;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RepeService {
    @Resource
    RepeMapper reeMapper;
    public List<Store> findRepe(String store){
        return reeMapper.findRepe(store);
    }
    public List<Store> findRe(String store){
        return reeMapper.findRe(store);
    }
}
