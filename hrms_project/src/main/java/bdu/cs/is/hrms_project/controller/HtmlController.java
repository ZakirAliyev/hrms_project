package bdu.cs.is.hrms_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/index")
    public String showIndexPage() {

        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage() {

        return "login";
    }

    @GetMapping("/contactus")
    public String showContactUsPage() {

        return "contactus";
    }

    @GetMapping("/information")
    public String showInformationPage() {

        return "information";
    }

    @GetMapping("/about")
    public String showAboutPage() {

        return "about";
    }

    @GetMapping("/login/ashr")
    public String showAsHrPage() {

        return "loginas/ashr";
    }

    @GetMapping("/login/asadmin")
    public String showAsAdminPage() {

        return "loginas/asadmin";
    }

    @GetMapping("/login/asmanager")
    public String showAsManagerPage() {

        return "loginas/asmanager";
    }

    @GetMapping("/login/asemployee")
    public String showAsEmployeePage() {

        return "loginas/asemployee";
    }


    @GetMapping("/employees/updateemployee")
    public String showUpdateEmployeePage() {
        return "/employees/updateemployee";
    }

    @GetMapping("/employees/deleteemployee")
    public String showDeleteEmployeePage() {
        return "/employees/deleteemployee";
    }

    @GetMapping("/employees/showemployee")
    public String showShowEmployeePage() {
        return "/employees/showemployee";
    }
}
