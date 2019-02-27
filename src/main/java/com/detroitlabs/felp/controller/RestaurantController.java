package com.detroitlabs.felp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantController {

    @RequestMapping("/")
    public String showAllRestaurants(ModelMap modelMap){
        return "home";
    }
}
