package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.ActivitytypeMapper;
import com.example.car.model.pojos.dai.Activitytype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor=Exception.class)
public class ActivitytypeService {
    @Autowired
    ActivitytypeMapper mapper;

    /*查询所有活动信息*/
    public List<Activitytype> selectAllType(){
        return mapper.selectAllType();
    }
}
