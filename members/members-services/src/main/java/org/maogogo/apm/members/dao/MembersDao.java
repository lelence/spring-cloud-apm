package org.maogogo.apm.members.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.maogogo.apm.members.bean.Member;

import java.util.List;

@Mapper
public interface MembersDao {

    @Select("select id, nick_name, cellphone, status, created_time from t_member")
    List<Member> findAll();

    @Select("select id, nick_name, cellphone, status, created_time from t_member where id=#{id}")
    Member findById(@Param("id") Integer id);

}
