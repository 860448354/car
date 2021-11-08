package com.example.car.model.services.czh;


import com.example.car.model.dao.czh.CarMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 车辆信息service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CarMessageService {
        @Autowired
    CarMessageMapper carMessageMapper;


        public Integer updateAge(String upState,Integer carId){
            int i = carMessageMapper.updateCar(upState, carId);
            return i;
        }

}
