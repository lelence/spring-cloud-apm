package org.maogogo.apm.members.services;

import org.maogogo.apm.members.bean.Member;

import java.util.List;

public interface MembersService {

    List<Member> getList();

    Member getById(Integer id);

}
