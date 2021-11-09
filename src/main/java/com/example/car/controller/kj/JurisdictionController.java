package com.example.car.controller.kj;


import com.example.car.model.services.kj.JurisdictionServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/juris")
public class JurisdictionController {
    @Autowired
    JurisdictionServices jurisdictionServices;

    /**查所有权限
     * @return
     */
    @GetMapping("all")
    public MyResult selectAll(){
        return jurisdictionServices.selectAll();
    }

    /** 根据角色id 查所具备的权限
     * @return
     */
    @GetMapping("rid")
    public MyResult selectByRid(Integer rid){
        return  jurisdictionServices.selectByRid(rid);
    }

    /** 根据角色id数组 查所有具备的权限
     * @param rids
     * @return
     */
    @PostMapping("rids")
    public MyResult selectByrids(@RequestBody Integer[] rids){
        System.out.println("数组"+rids.length);
        return jurisdictionServices.selectByRids(rids);
    }

    /**根据角色id 查路由数据
     * @param rids
     * @return
     */
    @PostMapping("rides")
    public MyResult selectByrides(@RequestBody Integer[] rids){
        return jurisdictionServices.selectByRidsPlus(rids);
    }

}
