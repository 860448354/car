package com.example.car.model.dao.dai;

import com.example.car.model.pojos.dai.Clientreview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientreviewMapper {
    /*新增关怀记录*/
    Integer insterByClient(Clientreview clientreview);
    /*根据id查询反馈内容*/
    List<Clientreview> selectByClient(Integer id);
}
