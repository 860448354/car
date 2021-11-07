package com.example.car.model.dao.czh;

import com.example.car.model.pojos.czh.MaintenanceDispatching;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 维修派工
 */
@Mapper
public interface MaintenanceDispatchingMapper {

    /** 查询所有
     * @return
     */
   List<MaintenanceDispatching> selectMaint();

}
