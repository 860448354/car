package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.CarMessageMapper;
import com.example.car.model.dao.czh.MaintenanceDispatchingMapper;
import com.example.car.model.pojos.czh.CarMessage;
import com.example.car.model.pojos.czh.MaintenanceDispatching;
import com.example.car.vojo.czh.MaintVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceDispatchingService {
    @Autowired
    MaintenanceDispatchingMapper mapper;
    @Autowired
    CarMessageMapper carMessageMapper;


    public List<MaintenanceDispatching> selectAllMaint(){
        List<MaintenanceDispatching> list = mapper.selectMaint();
        return list;
    }

    public Integer insertDisp(MaintVo maintVo){
        CarMessage carMessage =carMessageMapper.selectAById(maintVo.getCarMessageId());

        MaintVo vo = new MaintVo();
        vo.setCrId(carMessage.getCarCust().getCrId());
        vo.setCarMessageId(maintVo.getCarMessageId());
        vo.setSfId(maintVo.getSfId());
        vo.setPaiGongTime(maintVo.getPaiGongTime());
        vo.setState(maintVo.getState());

        int i = mapper.insetMaint(vo);
        if (i>0){
            carMessageMapper.updateCar("维修中", maintVo.getCarMessageId());
        }

        return i;
    }
}
