package com.detroitlabs.felp.data;

import com.detroitlabs.felp.model.Restaurant;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RestaurantRepository {

    private static final List<Restaurant> ALL_RESTAURANTS = Arrays.asList(
            new Restaurant("123 Easy Street", "Detroit", "Michigan", "Billys", "bbq", "2483549834", 100, "Best BBQ this side of town", "billys.jpg"),
            new Restaurant("145 Easy Street", "Rochester", "Michigan", "Shrimpys", "seafood", "2466541114", 50, "All you can eat shrimp", "shrimpys.jpg"),
            new Restaurant("532 Easy Street", "Troy", "Michigan", "Fishys", "seafood", "2483342214", 70, "Freshness is out speciality", "fishys.jpg"),
            new Restaurant("1728 Easy Street", "Detroit", "Michigan", "Angelos", "italian", "2483545464", 90, "A spicy meatball", "angelos.jpg"),
            new Restaurant("1234 Easy Street", "Detroit", "Michigan", "TikiTaco", "mexican", "2490548712", 100, "Mexican with a twist", "tikitaco.jpg"),
            new Restaurant("1237 Easy Street", "Saginaw", "Michigan", "Swans", "chinese", "2485649899", 100, "Fast, Hot and Ready", "swans.jpg"),
            new Restaurant("1723 Easy Street", "Detroit", "Michigan", "Homey", "artisan", "2483540254", 100, "Food with a flair", "homey.jpg"),
            new Restaurant("1923 Easy Street", "Troy", "Michigan", "KidsNThings", "american", "2480040634", 100, "Kids love us", "kidsnthings.jpg"),
            new Restaurant("1233 Easy Street", "Detroit", "Michigan", "FredBurger", "american", "2483549721", 100, "Burgers piled to the season", "fredburger.jpg"),
            new Restaurant("1203 Easy Street", "Detroit", "Michigan", "RedDragon", "thai", "2483579090", 100, "All the spices you can handle", "reddragon.jpg")
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
