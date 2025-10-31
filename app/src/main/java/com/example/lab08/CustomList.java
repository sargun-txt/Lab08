package com.example.lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        cities = new ArrayList<>();
    }

    public void addCity(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    public int countCities() {
        return 0;
    }

    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}