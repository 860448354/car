package com.example.car.controller.czh;

import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.hyj.Comm;
import com.example.car.model.services.czh.CarMessageService;
import com.example.car.model.services.czh.CustomerService;
import com.example.car.vojo.czh.CarCustVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 客户controller
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;


    /** 新增客户以及客户车辆信息
     * @param carCustVo
     * @return
     */
        @PostMapping("insertCustAndCar")
    public Integer insertCustomer(@RequestBody CarCustVo carCustVo){
        Integer integer = customerService.insertCust(carCustVo);


        if (integer>0){
            return 1;
        }else{
            return -1;
        }
    }

    /** 分页查询
     * @param carCustVo
     * @return
     */
    @PostMapping("selectPage")
    public PageInfo<Customer> selectPageCust(@RequestBody CarCustVo carCustVo){
        PageInfo<Customer> page = customerService.selectList(carCustVo);
        return page;

    }

    /** 删除客户
     * @param crId
     * @return
     */
    @GetMapping("deleteCust")
    public Integer delectCs(@RequestParam("crId")Integer crId){
        int i = customerService.deleteCust(crId);
        return i;
    }

    @GetMapping("commList")
    public List<Comm> selectAllComm(){
        List<Comm> list = customerService.selectListComm();
        return list;
    }
}
