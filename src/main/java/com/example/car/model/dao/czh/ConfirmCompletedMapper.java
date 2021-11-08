package com.example.car.model.dao.czh;

import com.example.car.model.pojos.czh.ConfirmCompleted;
import org.apache.ibatis.annotations.Mapper;
import org.w3c.dom.stylesheets.LinkStyle;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 完工记录mapper
 */
@Mapper
public interface ConfirmCompletedMapper {

    /** 新增完工信息
     * @return
     */
    Integer insertConfirm (int carMessageId, BigDecimal alMoney,int sfId);


    /** 查询确认完工
     * @return
     */
    List<ConfirmCompleted> selectConCom();
}
