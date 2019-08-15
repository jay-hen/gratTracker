package com.jesshenry.grattracker.Controllers;

import com.jesshenry.grattracker.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class GratController {

    @RequestMapping(value = "")
    public String index() {

        return "index";
    }

    @RequestMapping(value = "week", method = RequestMethod.GET)
    public String week(@SessionAttribute("user") User user) {
        System.out.println(user);
        return "week";
    }

    @RequestMapping(value = "add")
    public String add() {

        return "add";
    }

}
