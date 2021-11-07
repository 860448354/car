package com.example.car.model.dao.kj;

import com.example.car.model.pojos.kj.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    /** 根据部门id 查部门岗位
     * @param dtid
     * @return
     */
    List<Post>selectBydid(Integer dtid);
}
