package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.CaretypeMapper;
import com.example.car.model.pojos.dai.Caretype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaretypeService {
    @Autowired
    CaretypeMapper mapper;
/*查询所有*/
    public List<Caretype> selectAllByType(){
        return mapper.selectAllByType();
    }

}
