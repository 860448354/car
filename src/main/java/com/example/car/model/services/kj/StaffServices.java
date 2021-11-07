package com.example.car.model.services.kj;

import com.example.car.model.dao.kj.StaffMapper;
import com.example.car.model.dao.kj.UserMapper;
import com.example.car.model.pojos.kj.Staff;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class StaffServices {
    @Autowired
    StaffMapper staffMapper;
    @Autowired
    UserMapper userMapper;

    /**查所有的 员工职位 和岗位
     * @return
     */
    public MyResult selectAll(){
        return MyResult.SUCCESS_DATA(staffMapper.selectAll());
    }

    /** 新增成员 获得id 新增用户
     * @param staff
     * @return
     */

    public MyResult staffAdd(Staff staff){


        Integer add = null;
        Integer integer=null;
        try {
            add = staffMapper.add(staff);
            integer = userMapper.userAdd(staff.getUser(), staff.getPwd(), staff.getSfId());

        } catch (Exception e) {
            e.printStackTrace();
            add=-1;
        }

        System.out.println("新增id"+staff.getSfId());

        return add>0?MyResult.SUCCESS:MyResult.FAILURE("新增失败");
    }

    /** 根据用户 id 修改用户状态
     * @param sid
     * @param stateid
     * @return
     */
    public MyResult staffUpdate(String sid,String stateid){
        Integer integer = staffMapper.userStaffState(stateid, sid);
        return integer>0?MyResult.SUCCESS:MyResult.FAILURE("更新失败");
    }
}
