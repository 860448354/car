package com.example.car.model.dao.czh;

import com.example.car.vojo.czh.CarCustVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 客户接口
 */
@Mapper
public interface CostomerMapper {

    /** 新增客户
     * @param carCustVo 客户车辆vo
     * @return
     */
    Integer insertCostomer(CarCustVo carCustVo);

}