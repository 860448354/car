package com.example.car.model.dao.csp;

import com.example.car.model.pojos.csp.ConfirmVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerAccountMapper {
    public List<ConfirmVo> selConfirm();
}
