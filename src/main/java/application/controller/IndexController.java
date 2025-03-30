package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.Database;
import application.repository.DatabaseRepository;

@Controller
public class IndexController {
    @Autowired
    private DatabaseRepository database;

    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = {"/list", ""})
    public String select(Model ui){
        ui.addAttribute("nomes", database.findAll());
        return "list";
    }
}
