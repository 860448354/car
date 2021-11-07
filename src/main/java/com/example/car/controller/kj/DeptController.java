package com.example.car.controller.kj;

import com.example.car.model.services.kj.DeptServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptServices deptServices;

    /**查出所有部门和岗位
     * @return
     */
    @GetMapping("all")
    public MyResult selectAll(){
        return deptServices.selectAll();
    }

}
