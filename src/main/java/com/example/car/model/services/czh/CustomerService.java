package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.CarMessageMapper;
import com.example.car.model.dao.czh.CustomerMapper;
import com.example.car.model.pojos.czh.CarMessage;
import com.example.car.model.pojos.czh.Customer;
import com.example.car.vojo.czh.CarCustVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 客户service
 */
@Service
public class CustomerService{
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CarMessageMapper carMessageMapper;

    /** 新增客户信息
     * @param vo
     * @return
     */
    public Integer insertCust(CarCustVo vo){

        Integer i = customerMapper.insertCostomer(vo);
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

    /** 分页查询客户和车辆
     *
     * @return
     */
    public PageInfo<Customer> selectList(CarCustVo carCustVo){

        PageHelper.startPage(carCustVo.getPageNo(),carCustVo.getPageSize());

        List<Customer> list = customerMapper.selectCustAndCarList();

        return PageInfo.of(list);

    }

    public Integer deleteCust(int crId){
       int i =  customerMapper.updateCust(crId);
        return i;
    }

}
