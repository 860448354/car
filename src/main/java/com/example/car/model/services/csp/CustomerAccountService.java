package com.example.car.model.services.csp;

import com.example.car.model.dao.csp.CustomerAccountMapper;
import com.example.car.model.pojos.csp.ConfirmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerAccountService {
    @Autowired
    CustomerAccountMapper customerAccountMapper;

    public List<ConfirmVo> selConfirm(){
        return customerAccountMapper.selConfirm();
    }
}
