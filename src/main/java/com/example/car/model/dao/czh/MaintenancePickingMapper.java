package com.example.car.model.dao.czh;

import com.example.car.model.pojos.czh.MaintenancePicking;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 领料mapper
 */
@Mapper
public interface MaintenancePickingMapper {

    /** 新增领料表
     * @param mdId
     * @param lpId
     * @param pickingNum
     * @return
     */
    Integer insertPick(Integer mdId,Integer lpId,Integer pickingNum);


    /** 查询所有
     * @return
     */
    List<MaintenancePicking> selectPick();

}
