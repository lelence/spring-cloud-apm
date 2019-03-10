package org.maogogo.portal.dashboard;

import org.maogogo.apm.members.bean.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DashboardViewController {

    @Autowired
    IMembersServiceAPIFeign iMembersServiceAPIFeign;

    @RequestMapping("/dashboard")
    public String toDashboard(Model model) {
        return "dashboard";
    }


    @RequestMapping("/members")
    public String toMembers(Model model) {

        List<Member> members = iMembersServiceAPIFeign.getList();

        System.out.println("members ===>>");
        System.out.println(members);
        model.addAttribute("members", members);

        return "members";
    }


    @RequestMapping("/goods")
    public String toGoods(Model model) {

//        List<Member> members = iMembersServiceAPIFeign.getList();
//        model.addAttribute("members", members);

        return "goods";
    }


}
