package com.example.car.model.services.kj;

import com.example.car.model.dao.kj.UserMapper;
import com.example.car.util.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UsersServices {

    @Autowired
    UserMapper userMapper;

    /** 判断用户登录成功
     * @param use
     * @param pwd
     * @return
     */
    public MyResult selectLogin(String use,String pwd){
        return MyResult.SUCCESS_Object(userMapper.selectLogin(use, pwd));
    }
}
