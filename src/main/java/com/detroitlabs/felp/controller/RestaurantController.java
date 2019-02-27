package com.detroitlabs.felp.controller;

import com.detroitlabs.felp.data.RestaurantRepository;
import com.detroitlabs.felp.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/restaurant/{name}")
    public String restaurantDetails(@PathVariable String name, ModelMap modelMap){
        Restaurant restaurant = restaurantRepository.findRestaurantByNameToShowDetails(name);
        modelMap.put("restaurant", restaurant);
        return "restaurant-details";
    }

    @RequestMapping("search")
    public String searchByValue(@RequestParam("q") String searchValue, ModelMap modelMap) {
        List<Restaurant> allRestaurants = restaurantRepository.findByRestaurantByValue(searchValue);
        modelMap.put("allRestaurants", allRestaurants);
        return "home";
    }


}
