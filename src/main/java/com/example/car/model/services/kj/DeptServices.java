package com.example.car.model.services.kj;

import com.example.car.model.dao.kj.DeptMapper;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class DeptServices {
    @Autowired
    DeptMapper deptMapper;

    /** 查出所有部门 和岗位
     * @return
     */
    public MyResult selectAll(){

        return MyResult.SUCCESS_DATA(deptMapper.selectAll());
    }

}
