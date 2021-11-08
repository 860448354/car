package com.example.car.model.services.kj;

import com.example.car.model.dao.kj.RoleMapper;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServices {
    @Autowired
    RoleMapper roleMapper;
    public MyResult addRole(String name){
        Integer add = roleMapper.add(name);
        return add>0?MyResult.SUCCESS:MyResult.FAILURE("更新失败");
    }

    public MyResult selectRole(){
       return MyResult.SUCCESS_DATA(roleMapper.selectAll()) ;
    }

    /** 根据员工id 查 角色
     * @param sfid
     * @return
     */
    public MyResult selectByuid(Integer sfid){
        return  MyResult.SUCCESS_DATA(roleMapper.selectBySfid(sfid));
    }


}
