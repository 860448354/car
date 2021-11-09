package com.example.car.controller.czh;

import com.example.car.model.services.czh.CarMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
public class CarMessageController {
    @Autowired
    CarMessageService carMessageService;


    @GetMapping("updateCar")
    public Integer update(@RequestParam("upState") String upState,
                          @RequestParam("carId") Integer carId){
      int i =  carMessageService.updateAge(upState, carId);

      return i;
    }
}
