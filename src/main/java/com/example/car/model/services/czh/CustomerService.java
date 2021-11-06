package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.CarMessageMapper;
import com.example.car.model.dao.czh.CostomerMapper;
import com.example.car.model.pojos.czh.CarMessage;
import com.example.car.vojo.czh.CarCustVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 客户service
 */
@Service
public class CustomerService{
    @Autowired
    CostomerMapper costomerMapper;
    @Autowired
    CarMessageMapper carMessageMapper;

    /** 新增客户信息
     * @param vo
     * @return
     */
    public Integer insertCust(CarCustVo vo){

        Integer i = costomerMapper.insertCostomer(vo);
        List<CarMessage> list = vo.getCarMessages();
        for (CarMessage carMessage : list) {
            carMessageMapper.insertMessage(carMessage.getCarNumber(),carMessage.getCarType(),vo.getCrId());

        }

        if (i>0){
            return 1;
        }else{
            return -1;
        }
    }



}
