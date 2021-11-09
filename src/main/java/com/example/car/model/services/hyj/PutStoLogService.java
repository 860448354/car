package com.example.car.model.services.hyj;

import com.example.car.model.dao.hyj.PutStoLogMapper;
import com.example.car.model.pojos.hyj.PutSto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PutStoLogService {
    @Resource
    PutStoLogMapper putStoLog;
    public List<PutSto> findPutStoLog(){
        return putStoLog.findPutStoLog();
    }
}
