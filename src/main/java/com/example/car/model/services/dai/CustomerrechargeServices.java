package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.CustomerrechargeMapper;
import com.example.car.model.pojos.dai.Customerrecharge;
import com.example.car.model.pojos.dai.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerrechargeServices {
    @Autowired
    CustomerrechargeMapper mapper;

    /*新增一条会员充值记录*/
    public Integer insterAll(Customerrecharge customerrecharge){
        return mapper.insterAll(customerrecharge);
    }
    /*修改会员余额*/
    public  Integer updayeByMeony(Member member){
        return mapper.updayeByMeony(member);
    }
}
