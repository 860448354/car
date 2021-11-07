package com.example.car.controller.dai;

import com.example.car.model.dao.dai.ActparticipantsMapper;
import com.example.car.model.pojos.dai.Actparticipants;
import com.example.car.model.services.dai.ActparticipantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping( "/participants")
public class ActparticipantsController {
    @Autowired
    ActparticipantsService service;

    /*根据id查询*/
    @GetMapping("select/{id}")
    public List<Actparticipants> selectById(@PathVariable("id") Integer id){
        return service.selectByPants(id);
    }
}
