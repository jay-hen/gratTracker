package com.jesshenry.grattracker.Controllers;

import com.jesshenry.grattracker.Models.User;
import com.jesshenry.grattracker.Models.data.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

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

    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String displaySignup(Model model) {

        model.addAttribute(new User());
        model.addAttribute("users", UserDao.getUsername());
        return "signup";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processSignup(Model model, @ModelAttribute @Valid User user, Errors errors) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Sign Up!");
            return "signup";
        }

        UserDao.save(user);
        return "redirect:";
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
