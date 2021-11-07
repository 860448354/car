package com.example.car.model.dao.dai;

import com.example.car.model.pojos.dai.Activity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActivityMapper {
   /*新增活动*/
    Integer insterAllActvity (Activity activity);

}
