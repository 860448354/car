package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.ConfirmCompletedMapper;
import com.example.car.model.pojos.czh.ConfirmCompleted;
import com.example.car.vojo.czh.ComVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 完工记录service
 */
@Service
@Transactional(rollbackFor = Exception.class)
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
        System.out.println(carMessageId+"111111111111111111111111111111111111111111");
            Integer i = confirmCompletedMapper.insertConfirm( carMessageId, alMoney, sfId);
            return i;
    }

    /** 查询确认完工
     * @return
     */
    public List<ConfirmCompleted> selectComp(ComVo comVo){
        List<ConfirmCompleted> list = confirmCompletedMapper.selectConCom(comVo);
        return list;
    }
}
