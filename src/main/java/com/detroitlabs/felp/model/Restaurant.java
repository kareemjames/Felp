package com.detroitlabs.felp.model;

public class Restaurant {
    private String location;
    private String name;
    private String cuisine;
    private String phoneNumber;
    private int rating;
    private String description;

    public Restaurant(String location, String name, String cuisine, String phoneNumber, int rating, String description) {
        this.location = location;
        this.name = name;
        this.cuisine = cuisine;
        this.phoneNumber = phoneNumber;
        this.rating = rating;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
