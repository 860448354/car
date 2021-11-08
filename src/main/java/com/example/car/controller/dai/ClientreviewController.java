package com.example.car.controller.dai;

import com.example.car.model.dao.dai.ClientreviewMapper;
import com.example.car.model.pojos.dai.Clientreview;
import com.example.car.model.pojos.dai.Customercare;
import com.example.car.model.services.dai.ClientreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping( "/clientreview")
public class ClientreviewController {
    @Autowired
    ClientreviewService service;

    @PostMapping("/inster")
    public Integer insterByClient(@RequestBody Clientreview clientreview){
        System.out.println("this is"+clientreview);
        Integer ins=service.insterByClient(clientreview);
        return ins;
    }
    /*查询*/
    @GetMapping("/select/{id}")
    public List<Clientreview> selectByClient(@PathVariable("id") Integer id){
        System.out.println("this is"+id);
        return service.selectByClient(id);
    }
}
