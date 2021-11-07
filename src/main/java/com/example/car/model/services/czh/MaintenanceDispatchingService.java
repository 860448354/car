package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.MaintenanceDispatchingMapper;
import com.example.car.model.pojos.czh.MaintenanceDispatching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceDispatchingService {
    @Autowired
    MaintenanceDispatchingMapper mapper;


    public List<MaintenanceDispatching> selectAllMaint(){
        List<MaintenanceDispatching> list = mapper.selectMaint();
        return list;
    }
}
