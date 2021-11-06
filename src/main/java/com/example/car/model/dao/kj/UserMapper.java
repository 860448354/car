package com.example.car.model.dao.kj;

import com.example.car.model.pojos.kj.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User selectLogin(@Param(value = "use") String use,@Param(value = "pwd") String pwd);
}
