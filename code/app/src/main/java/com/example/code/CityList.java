package com.example.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * @param city to check if it's contained in the list
     * @return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * @param city the city to delete from the list
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        boolean hasCity = cities.remove(city);
        if (!hasCity) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * @return the number of elements in the list
     */
    public int countCities() {
        return cities.size();
    }
}
