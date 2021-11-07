package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.ActivityMapper;
import com.example.car.model.pojos.dai.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServices {
    @Autowired
    ActivityMapper mapper;

    public Integer insterAllActvity(Activity activity){
        return mapper.insterAllActvity(activity);
    }
}
