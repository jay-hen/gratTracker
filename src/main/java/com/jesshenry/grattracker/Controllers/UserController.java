package com.jesshenry.grattracker.Controllers;

import com.jesshenry.grattracker.Models.User;
import com.jesshenry.grattracker.Models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("title", "Log In!");
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(Model model, HttpServletRequest request,
                        HttpServletResponse response) {

        model.addAttribute("title", "Log In!");

        if(request.getParameter("id").equals(userDao.findAll())) {
            return "week";
        }

        return "redirect:";
    }

    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String displaySignup(Model model) {

        model.addAttribute("title", "Sign Up!");
        model.addAttribute("user", new User());

        return "signup";
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public String processSignup(Model model, @ModelAttribute @Valid User user, Errors errors) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Sign Up!");
            return "signup";
        }

        userDao.save(user);
        return "redirect:";
    }
}
