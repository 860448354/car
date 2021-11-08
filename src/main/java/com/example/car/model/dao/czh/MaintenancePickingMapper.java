package com.example.car.model.dao.czh;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MaintenancePickingMapper {

    /** 新增领料表
     * @param mdId
     * @param lpId
     * @param pickingNum
     * @return
     */
    Integer insertPick(Integer mdId,Integer lpId,Integer pickingNum);

}
