package org.maogogo.portal.dashboard;

import org.maogogo.apm.members.bean.Member;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IMembersServiceAPIFailure implements IMembersServiceAPIFeign {

    @Override
    public String hello() {
        return null;
    }

    @Override
    public List<Member> getList() {
        System.out.println("diudiuddiu");
        return new ArrayList<>();
    }

    @Override
    public Member getById(Integer id) {
        return null;
    }

}
