package org.maogogo.portal.signin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class SignInViewController {

    @RequestMapping("/login")
    public String toLogin(HttpServletRequest request) {
        log.info("{} to login view", request.getRemoteHost());
        return "login";
    }

}
