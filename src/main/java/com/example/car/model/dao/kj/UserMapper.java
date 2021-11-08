package com.example.car.model.dao.kj;

import com.example.car.model.pojos.kj.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectLogin(@Param(value = "use") String use,@Param(value = "pwd") String pwd);
    Integer userAdd(@Param(value = "use") String use,@Param(value = "pwd") String pwd,@Param(value = "sid") Integer sid);
    List<User> selectAll();
}
