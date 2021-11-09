package com.example.car.controller.kj;


import com.example.car.model.services.kj.StaffRoleServices;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staffrole")
public class StaffRoleController {
    @Autowired
    StaffRoleServices staffRoleServices;

    /** 新增 角色用户表
     * @param staffid
     * @param roleid
     * @return
     */
    @PostMapping("add")
    public MyResult staffAdd(@RequestParam("staffid") Integer staffid,@RequestParam("roleid") Integer roleid){
        System.out.println("员工id"+staffid);
        System.out.println("角色id"+roleid);
        return staffRoleServices.staffRoleAdd(staffid, roleid);
    }

    /** 移除用户
     * @param staffid
     * @param roleid
     * @return
     */
    @PostMapping("dele")
    public MyResult staffDelete(@RequestParam("staffid") Integer staffid,@RequestParam("roleid") Integer roleid){

        return staffRoleServices.staffRoleDelete(staffid,roleid);
    }

}
