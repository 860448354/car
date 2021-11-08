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

    /** 根据角色 id 查权限
     * @param rid
     * @return
     */
    public MyResult selectByRid(Integer rid){
        return MyResult.SUCCESS_DATA(jurisdictionMapper.selectByrid(rid));
    }

    /** 根据角色id 数组 查权限 去掉重复
     * @param rids
     * @return
     */
    public MyResult selectByRids(Integer[] rids){
        return MyResult.SUCCESS_DATA(jurisdictionMapper.selectByrids(rids));
    }

    /** 根据角色id 数组 查路由路径
     * @param rids
     * @return
     */
    public MyResult selectByRidsPlus(Integer[] rids){
        return MyResult.SUCCESS_DATA(jurisdictionMapper.selectByridsPlus(rids));
    }
}
