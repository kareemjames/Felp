package com.detroitlabs.felp.data;

import com.detroitlabs.felp.model.Restaurant;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RestaurantRepository {

    private static final List<Restaurant> ALL_RESTAURANTS = Arrays.asList(
      new Restaurant("123 Easy Street", "Detroit", "Michigan", "Chicken Hut", "Chicken", "2483549834", 100, "Local Ma' and Pa' Shop"),
      new Restaurant("145 Easy Street", "Rochester", "Michigan", "Shrimp Hut", "Shrimp", "2466549834", 50, "Local Ma' and Pa' Shop"),
      new Restaurant("532 Easy Street", "Troy", "Michigan", "Fish Hut", "Fish", "2483549234", 60, "Local Ma' and Pa' Shop")
    );

    public List<Restaurant> getAllRestaurants() {
        return ALL_RESTAURANTS;
    }

}
