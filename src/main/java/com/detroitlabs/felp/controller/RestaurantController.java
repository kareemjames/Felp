package com.detroitlabs.felp.controller;

import com.detroitlabs.felp.data.RestaurantRepository;
import com.detroitlabs.felp.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RestaurantController {

    private Restaurant restaurant;

    @Autowired
    RestaurantRepository restaurantRepository;

    @RequestMapping("/")
    public String showAllRestaurants(ModelMap modelMap){
        List<Restaurant> allRestaurants = restaurantRepository.getAllRestaurants();

        modelMap.put("allRestaurants", allRestaurants);
        return "home";
    }
}
