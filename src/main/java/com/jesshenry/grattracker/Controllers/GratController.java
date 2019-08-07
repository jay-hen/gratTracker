package com.jesshenry.grattracker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GratController {

    @RequestMapping(value = "")
    public String index() {

        return "index";
    }

    @RequestMapping(value = "login")
    public String login() {

        return "login";
    }

    @RequestMapping(value = "signup")
    public String signup() {

        return "signup";
    }

    @RequestMapping(value = "week")
    public String week() {

        return "week";
    }

    @RequestMapping(value = "add")
    public String add() {

        return "add";
    }

}
