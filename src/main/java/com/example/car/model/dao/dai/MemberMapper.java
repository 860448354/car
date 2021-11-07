package com.example.car.model.dao.dai;

import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.dai.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {
/*分页查询会员*/
  List<Member> selectByChoose(Member member);
  /*查询所有会员*/
  List<Member> selectAll();
  /*分页查询所有员工*/
  List<Customer> selectByChooseCus(Customer customer);
  /*新增会员*/
  Integer insterAll(Member member);
  /*修改非会员*/
  Integer updataByMem(Integer id);
  /*修改客户信息*/
  Integer updataByCustomer(Customer customer);
}
