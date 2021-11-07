package com.example.car.model.dao.czh;

import com.example.car.model.pojos.czh.CarMessage;
import com.example.car.vojo.czh.CarCustVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 车辆信息接口
 */
@Mapper
public interface CarMessageMapper {


    /** 查询车辆根据主键
     * @return
     */
    CarMessage selectAById(Integer crId);


    /** 新增客户车辆信息
     * @param carId 车辆主键
     * @param carName 车辆姓名
     * @param CustId 客户
     * @return
     */
    Integer insertMessage(String carId,String carName,int CustId);


    Integer updateCar(String upState,Integer carId);
}
