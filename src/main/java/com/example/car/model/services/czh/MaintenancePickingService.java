package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.MaintenancePickingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaintenancePickingService {
    @Autowired
    MaintenancePickingMapper mapper;

    public Integer insertPicking(Integer mdId,Integer lpId,Integer pickingNum){
            int i= mapper.insertPick(mdId, lpId, pickingNum);
        return i;
    }
}
