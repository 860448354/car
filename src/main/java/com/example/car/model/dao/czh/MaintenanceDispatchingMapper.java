package com.example.car.model.dao.czh;

import com.example.car.model.pojos.czh.MaintenanceDispatching;
import com.example.car.vojo.czh.MaintVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 维修派工
 */
@Mapper
public interface MaintenanceDispatchingMapper {

    /** 查询所有
     * @return
     */
   List<MaintenanceDispatching> selectMaint(@Param("maintVo") MaintVo maintVo);


    /** 新增派工
     * @param maintVo
     * @return
     */
   Integer insetMaint(MaintVo maintVo);

}
