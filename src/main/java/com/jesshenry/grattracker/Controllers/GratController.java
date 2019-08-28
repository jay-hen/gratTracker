package com.jesshenry.grattracker.Controllers;

import com.jesshenry.grattracker.Models.Grat;
import com.jesshenry.grattracker.Models.data.GratDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class GratController {

    @Autowired
    private GratDao gratDao;

    @RequestMapping(value = "")
    public String index() {

        return "index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAdd(Model model) {

        model.addAttribute("title", "Add Data!");
        model.addAttribute("grat", new Grat());

        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAdd(Model model, @ModelAttribute @Valid Grat grat, Errors errors) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Data!");
            return "add";
        }

        gratDao.save(grat);
        return "week";
    }

//    @RequestMapping(value = "gratchart", method = RequestMethod.GET)
//    public String displayChart() {
//        GratChart gratChart = new gratChart();
//    }
}
