package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.MaintenancePickingMapper;
import com.example.car.model.pojos.czh.MaintenancePicking;
import com.example.car.model.pojos.hyj.RepeComm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 维修领料service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MaintenancePickingService {
    @Autowired
    MaintenancePickingMapper mapper;

    /** 新增维修领料
     * @param mdId
     * @param lpId
     * @param pickingNum
     * @return
     */
    public Integer insertPicking(Integer mdId,Integer lpId,Integer pickingNum){
            int i= mapper.insertPick(mdId, lpId, pickingNum);

        RepeComm repeComm = mapper.selectRe(lpId);

        mapper.updateRe((repeComm.getRepeCommNum() - pickingNum),lpId);
        return i;
    }


    /** 查询所有维修领料
     * @return
     */
    public List<MaintenancePicking> selectList(){
        List<MaintenancePicking> list = mapper.selectPick();
        return list;
    }
}
