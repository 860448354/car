package com.example.car.model.dao.hyj;

import com.example.car.model.pojos.hyj.PutSto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PutStoLogMapper {
    List<PutSto> findPutStoLog();
}
