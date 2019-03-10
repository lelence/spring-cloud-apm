package org.maogogo.apm.members.api;

import org.maogogo.apm.members.bean.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/members")
public interface IMemberServiceAPI {

    @GetMapping("/hello")
    String hello();

    @GetMapping("/list")
    List<Member> getList();

    @GetMapping("/{id}")
    Member getById(@PathVariable("id") Integer id);

}
