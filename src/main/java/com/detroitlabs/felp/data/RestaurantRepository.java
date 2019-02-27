package com.detroitlabs.felp.data;

import com.detroitlabs.felp.model.Restaurant;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RestaurantRepository {

    private static final List<Restaurant> ALL_RESTAURANTS = Arrays.asList(
            new Restaurant("123 Easy Street", "Detroit", "Michigan", "ChickenHut", "Chicken", "2483549834", 100, "Local Ma' and Pa' Shop"),
            new Restaurant("145 Easy Street", "Rochester", "Michigan", "ShrimpHut", "Shrimp", "2466549834", 50, "Local Ma' and Pa' Shop"),
            new Restaurant("532 Easy Street", "Troy", "Michigan", "FishHut", "Fish", "2483549234", 60, "Local Ma' and Pa' Shop"),
            new Restaurant("1728 Easy Street", "Detroit", "Michigan", "pizza", "american", "2483549834", 90, "Local Ma' and Pa' Shop")
    );

    public List<Restaurant> getAllRestaurants() {
        return ALL_RESTAURANTS;
    }

    public Restaurant findRestaurantByNameToShowDetails(String name) {
        for (Restaurant restaurant : ALL_RESTAURANTS) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                return restaurant;
            }
        }
        return null;
    }

    public List<Restaurant> findByRestaurantByValue(String value) {
        String lowerCaseValue = value.toLowerCase();
        Restaurant foundByValue;
        List<Restaurant> restaurantsFoundBySearchValue = new ArrayList<>();

        for (Restaurant restaurant : ALL_RESTAURANTS) {
            if (restaurant.getName().contains(lowerCaseValue) || restaurant.getCuisine().equalsIgnoreCase(lowerCaseValue)) {
                foundByValue = restaurant;
                restaurantsFoundBySearchValue.add(foundByValue);
            }
        }
        return restaurantsFoundBySearchValue;
    }



}
