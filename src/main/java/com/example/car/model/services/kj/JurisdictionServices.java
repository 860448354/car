package com.example.car.model.services.kj;

import com.example.car.model.dao.kj.JurisdictionMapper;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JurisdictionServices {
    @Autowired
    JurisdictionMapper jurisdictionMapper;

    /**查所有权限
     * @return
     */
    public MyResult selectAll(){
        return  MyResult.SUCCESS_DATA(jurisdictionMapper.selectAll());
    }
}
