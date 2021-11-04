package com.example.car.model.services.hyj;

import com.example.car.model.dao.hyj.test;
import com.example.car.model.pojos.hyj.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    test test;
    public List<Test> find(){
        return test.find();
    }
}
