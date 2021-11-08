package com.example.car.controller.kj;


import com.example.car.model.services.kj.RoleJurisdictionServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rolejuris")
public class RoleJurisdictionController {
    @Autowired
    RoleJurisdictionServices roleJurisdictionServices;

    @PostMapping("add/{rid}")
    public MyResult insetRoleJuris(@PathVariable("rid") Integer  rid, @RequestBody Integer[] juris){
        System.out.println("拿到角色id"+rid);
        System.out.println("拿到权限数组"+juris.length);
        MyResult myResult = roleJurisdictionServices.deleteRouleJuris(rid);
        System.out.println("删除后"+myResult);

        return roleJurisdictionServices.insetRoleJuris(rid, juris);

    }


}
