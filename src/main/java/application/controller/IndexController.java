package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Database;
import application.repository.Repository;

@Controller
@RequestMapping(value="/")
public class IndexController {
    @Autowired
    private Repository database;

    @RequestMapping(value={"/list", ""})
    public String select(Model ui){
        ui.addAttribute("genero", database.findAll());
        return "list";
    }

}
