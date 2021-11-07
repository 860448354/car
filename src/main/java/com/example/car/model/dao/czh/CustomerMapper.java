package com.example.car.model.dao.czh;

import com.example.car.model.pojos.czh.Customer;
import com.example.car.vojo.czh.CarCustVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 客户接口
 */
@Mapper
public interface CustomerMapper {

    /** 新增客户
     * @param carCustVo 客户车辆vo
     * @return
     */
    Integer insertCostomer(CarCustVo carCustVo);


    /** 查询所有车辆和客户
     * @return
     */
    List<Customer> selectCustAndCarList();


    /** 查询所有客户信息
     * @return
     */
    List<Customer> selectCustAll();


    /** 删除客户
     * @param crid
     * @return
     */
    Integer updateCust(int crid);

}
