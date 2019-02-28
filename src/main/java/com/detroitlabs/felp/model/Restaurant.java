package com.detroitlabs.felp.model;

public class Restaurant {
    private String streetAddress;
    private String city;
    private String state;
    private String name;
    private String cuisine;
    private String phoneNumber;
    private int rating;
    private String description;
    private String imageName;

    public Restaurant(String streetAddress, String city, String state, String name, String cuisine, String phoneNumber, int rating, String description, String imageName) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.name = name;
        this.cuisine = cuisine;
        this.phoneNumber = phoneNumber;
        this.rating = rating;
        this.description = description;
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", name='" + name + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                ", imageName='" + imageName + '\'' +
                '}';
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
