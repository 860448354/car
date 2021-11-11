package com.example.car.model.services.kj;

import com.example.car.model.dao.kj.RoleJurisdictionMapper;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class RoleJurisdictionServices {
    @Autowired
    RoleJurisdictionMapper roleJurisdictionMapper;

    public MyResult insetRoleJuris(Integer rid,Integer[]juris){
        Integer integer = roleJurisdictionMapper.roleJurisdictionAdd(rid, juris);
        return integer>0?MyResult.SUCCESS:MyResult.FAILURE("角色权限新增失败");
    }

    public MyResult deleteRouleJuris(Integer rid){
        Integer integer = roleJurisdictionMapper.roleJurisdictionDelte(rid);
        return integer>0?MyResult.SUCCESS:MyResult.FAILURE("角色权限删除失败");
    }

}
