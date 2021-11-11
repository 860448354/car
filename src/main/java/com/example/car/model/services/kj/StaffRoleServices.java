package com.example.car.model.services.kj;


import com.example.car.model.dao.kj.StaffRoleMapper;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class StaffRoleServices {
    @Autowired
    StaffRoleMapper staffRoleMapper;

    /**新增 用户角色表
     * @param staffid
     * @param roleid
     * @return
     */
    public MyResult staffRoleAdd(Integer staffid,Integer roleid){

        Integer integer = staffRoleMapper.staffRoleAdd(staffid, roleid);

        return  integer>0?MyResult.SUCCESS:MyResult.FAILURE("新增失败");

    }

    /** 移除用户角色
     * @param staffid
     * @param roleid
     * @return
     */
    public MyResult staffRoleDelete(Integer staffid,Integer roleid){
        Integer integer = staffRoleMapper.staffRoleDele(staffid, roleid);
        return integer>0?MyResult.SUCCESS:MyResult.FAILURE("新增失败");
    }
}
