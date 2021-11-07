package com.example.car.model.dao.dai;

import com.example.car.model.pojos.dai.Actparticipants;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActparticipantsMapper {
    /*根据ID查询*/
    List<Actparticipants> selectByPants(Integer id);
}
