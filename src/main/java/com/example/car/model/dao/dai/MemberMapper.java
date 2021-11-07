package com.example.car.model.dao.dai;

import com.example.car.model.pojos.dai.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {
/*分页查询会员*/
  List<Member> SelectByChoose(Member member);
}
