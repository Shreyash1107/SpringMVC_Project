package org.alumni.controller;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import org.alumni.model.LoginModel;
import org.alumni.service.Loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    Loginservice loginservice;

    @RequestMapping(value = "/")
    public String getloginpage() {
        return "index";
    }

    @RequestMapping(value = "/reg")
    public String register() {
        return "Register";
    }

    @RequestMapping(value = "/save")
    public String register(LoginModel lmodel) {
        boolean isRegistered = loginservice.isStudentregister(lmodel);
        if (isRegistered) {
            return "index";
        } else {
            return "Register";
        }
    }

    @RequestMapping(value = "/validate")
    public ModelAndView acceptlogin(HttpServletRequest request, LoginModel model, Model viewModel) {
        String username = request.getParameter("Username");
        String password = request.getParameter("Password");

        model.setusername(username);
        model.setpassword(password);

        Vector<LoginModel> userlogin = loginservice.getlogin(username, password);
        if (userlogin != null && !userlogin.isEmpty()) {
            return new ModelAndView("home");
        } else {
            viewModel.addAttribute("errorMessage", "Invalid username or password. Please try again.");
            return new ModelAndView("index");
        }
    }
}
