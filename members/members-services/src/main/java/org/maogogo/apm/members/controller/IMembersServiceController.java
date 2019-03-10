package org.maogogo.apm.members.controller;

import lombok.extern.slf4j.Slf4j;
import org.maogogo.apm.members.api.IMemberServiceAPI;
import org.maogogo.apm.members.bean.Member;
import org.maogogo.apm.members.services.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class IMembersServiceController implements IMemberServiceAPI {


    @Autowired
    MembersService membersService;

    public String hello() {
        return "hello";
    }

    public List<Member> getList() {
        log.info("get all list");
        return membersService.getList();
    }

    public Member getById(@PathVariable("id") Integer id) {
        return membersService.getById(id);
    }


}
