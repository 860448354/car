package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.MaintenancePickingMapper;
import com.example.car.model.pojos.czh.MaintenancePicking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenancePickingService {
    @Autowired
    MaintenancePickingMapper mapper;

    public Integer insertPicking(Integer mdId,Integer lpId,Integer pickingNum){
            int i= mapper.insertPick(mdId, lpId, pickingNum);
        return i;
    }


    public List<MaintenancePicking> selectList(){
        List<MaintenancePicking> list = mapper.selectPick();
        return list;
    }
}
