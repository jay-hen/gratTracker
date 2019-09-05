package com.jesshenry.grattracker.Controllers;

import com.jesshenry.grattracker.Models.User;
import com.jesshenry.grattracker.Models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

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
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        System.out.println("IM HEREEEE!!!" + username);
//        if (username.equals("Jay") && password.equals("mabeldog")) {
//            return "week";
////            user.setUsername("Jay");
//        } else {
//            return "login";
//        }
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

    @RequestMapping(value = "week", method = RequestMethod.GET)
    public String week() {

        return "week";
    }


}
