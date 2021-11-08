package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.ConfirmCompletedMapper;
import com.example.car.model.pojos.czh.ConfirmCompleted;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 完工记录service
 */
@Service
public class ConfirmCompletedService {

    @Autowired
    ConfirmCompletedMapper confirmCompletedMapper;


    /** 新增完工记录
     * @param carMessageId
     * @param alMoney
     * @param sfId
     * @return
     */
    public Integer insertCompleted( int carMessageId, BigDecimal alMoney, int sfId){
            Integer i = confirmCompletedMapper.insertConfirm( carMessageId, alMoney, sfId);
            return i;
    }

    /** 查询确认完工
     * @return
     */
    public List<ConfirmCompleted> selectComp(){
        List<ConfirmCompleted> list = confirmCompletedMapper.selectConCom();
        return list;
    }
}
