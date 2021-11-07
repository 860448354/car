package com.example.car.model.dao.dai;

import com.example.car.model.pojos.dai.Activity;
import com.example.car.model.pojos.dai.Actparticipants;
import com.example.car.vojo.dai.ActivityMemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityMapper {
   /*新增活动*/
    Integer insterAllActvity (ActivityMemberVo activity);
    /*新增活动参加人员*/
    Integer insterByMember(Actparticipants actparticipants);
    /*查询所有活动*/
    List<Activity> selectByChoose(Activity activity);

}
