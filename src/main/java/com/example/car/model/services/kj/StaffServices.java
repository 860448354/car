package com.example.car.model.services.kj;

import com.example.car.model.dao.kj.StaffMapper;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServices {
    @Autowired
    StaffMapper staffMapper;

    /**查所有的 员工职位 和岗位
     * @return
     */
    public MyResult selectAll(){
        return MyResult.SUCCESS_DATA(staffMapper.selectAll());
    }
}
