package com.example.car.model.dao.dai;

import com.example.car.model.pojos.dai.Customerrecharge;
import com.example.car.model.pojos.dai.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*充值记录表*/
@Mapper
public interface CustomerrechargeMapper {
    /*新增记录*/
    Integer insterAll(Customerrecharge customerrecharge);
    /*会员充值记录之后修改会员的余额*/
    Integer updayeByMeony(Member member);
    /*查询会员新增记录*/
    List<Customerrecharge> selectAll(Integer id);
}
