package bdu.cs.is.hrms_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login/ashr")
    public String loginAsHr(@RequestParam String username, @RequestParam String password) {
        if (username != null && password != null && username.equals("hr") && password.equals("hr")) {
            return "/welcomes/welcomehr";
        } else {
            return "/error";
        }
    }
}
