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
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @ModelAttribute("user")
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String displayLogin(Model model) {

        model.addAttribute("title", "Log In!");
        model.addAttribute("user", new User());

        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String processLogin(@ModelAttribute("user") User user, Model model) {

        if (user.getUsername().equals("Jay") && user.getPassword().equals("mabeldog")) {
            user.setUsername("Jay");
        } else {
            return "login";
        }

        return "week";
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
