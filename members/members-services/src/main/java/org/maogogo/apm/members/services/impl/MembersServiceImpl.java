package org.maogogo.apm.members.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.maogogo.apm.members.bean.Member;
import org.maogogo.apm.members.dao.MembersDao;
import org.maogogo.apm.members.services.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MembersServiceImpl implements MembersService {

    @Autowired
    MembersDao membersDao;

    @Override
    public List<Member> getList() {
        log.info("get member list ");
        return membersDao.findAll();
    }

    @Override
    public Member getById(Integer id) {
        log.info("get member by id: {}", id);
        return membersDao.findById(id);
    }
}
