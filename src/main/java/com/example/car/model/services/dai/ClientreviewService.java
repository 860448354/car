package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.ClientreviewMapper;
import com.example.car.model.pojos.dai.Clientreview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientreviewService {
    @Autowired
    ClientreviewMapper mapper;

    /*新增关怀记录*/
    public Integer insterByClient(Clientreview clientreview){
        return mapper.insterByClient(clientreview);
    }
    /*根据id查询*/
    public List<Clientreview> selectByClient(Integer id){
        return mapper.selectByClient(id);
    }
}
