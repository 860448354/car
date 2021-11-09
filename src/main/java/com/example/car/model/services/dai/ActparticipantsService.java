package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.ActparticipantsMapper;
import com.example.car.model.pojos.dai.Actparticipants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor=Exception.class)
public class ActparticipantsService {
   @Autowired
    ActparticipantsMapper mapper;

   /*根据id查询*/
   public List<Actparticipants> selectByPants(Integer id){
         return  mapper.selectByPants(id);
   }
}
