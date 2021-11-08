package com.example.car.model.services.czh;

import com.example.car.model.dao.czh.CarMessageMapper;
import com.example.car.model.dao.czh.MaintenanceDispatchingMapper;
import com.example.car.model.pojos.czh.CarMessage;
import com.example.car.model.pojos.czh.MaintenanceDispatching;
import com.example.car.vojo.czh.MaintVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 维修派工service
 */
@Service
public class MaintenanceDispatchingService {
    @Autowired
    MaintenanceDispatchingMapper mapper;
    @Autowired
    CarMessageMapper carMessageMapper;


    /** 查询所有维修派工
     * @param maintVo
     * @return
     */
    public List<MaintenanceDispatching> selectAllMaint(MaintVo maintVo){
        List<MaintenanceDispatching> list = mapper.selectMaint(maintVo);
        return list;
    }

    /** 新增维修派工
     * @param maintVo
     * @return
     */
    public Integer insertDisp(MaintVo maintVo){
        CarMessage carMessage =carMessageMapper.selectAById(maintVo.getCarMessageId());

        MaintVo vo = new MaintVo();
        vo.setCrId(carMessage.getCarCust().getCrId());
        vo.setCarMessageId(maintVo.getCarMessageId());
        vo.setSfId(maintVo.getSfId());
        vo.setPaiGongTime(maintVo.getPaiGongTime());
        vo.setState(maintVo.getState());

        int i = mapper.insetMaint(vo);
        if (i>0){
            carMessageMapper.updateCar("维修中", maintVo.getCarMessageId());
        }

        return i;
    }

    /** 修改金额
     * @param money
     * @param mdId
     * @return
     */
    public Integer updateDisp(BigDecimal money, Integer mdId){

        System.out.println("修改的金额"+money);
        System.out.println("选择修改的主键"+mdId);
            Integer i = mapper.updateMoeny(money,mdId);

            return i;
    }
}
