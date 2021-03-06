package com.example.car.model.services.dai;

import com.example.car.model.dao.dai.ActivityMapper;
import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Activity;
import com.example.car.model.pojos.dai.Actparticipants;
import com.example.car.model.pojos.dai.Member;
import com.example.car.vojo.dai.ActivityMemberVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor=Exception.class)
public class ActivityService {
    @Autowired
    ActivityMapper mapper;
    /*新增活动*/
    public Integer insterAllActvity(ActivityMemberVo activityMemberVo){
        Integer ins=mapper.insterAllActvity(activityMemberVo);
        System.out.println("look at me"+activityMemberVo);
        List<Object> list=activityMemberVo.getFruitesis();
        for(Object object : list) {
            Map entry = (Map)object;
            Object i = (Object) entry.get("crId");
            Map entryes = (Map)i;
            Integer ii = (Integer) entryes.get("crId");
            System.out.println("this is"+ii);
            Customer customer=new Customer();
            customer.setCrId(ii);
            Activity activityo=new Activity();
            activityo.setActiId(activityMemberVo.getActiId());
            Actparticipants actparticipants=new Actparticipants();
            actparticipants.setPanActId(activityo);
            actparticipants.setPanMemId(customer);
            mapper.insterByMember(actparticipants);
        }
        return ins;
    }

    /*新增参加人员*/
    public Integer insterByMember(Actparticipants actparticipants){
        return mapper.insterByMember(actparticipants);
    }

    /*分页查询*/
    public PageInfo<Activity> selectByChoose(Integer pageNo,
                                           Integer pageSize,
                                             Activity activity){
        PageHelper.startPage(pageNo,pageSize);/*开启分页模式*/
        List<Activity> list = mapper.selectByChoose(activity);/*调用查询方法*/
        return new PageInfo<>(list);/*将查询结果封装到PageInfo对象中*/
    }
    /*修改state*/
    public Integer updataByState(Activity activity){
        return mapper.updataByState(activity);
    }
}
