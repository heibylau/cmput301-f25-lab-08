package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public boolean deleteCity(City city) {
        for (int i = 0; i < cities.size(); i++) {
            String cityName = cities.get(i).getCityName();
            String provinceName = cities.get(i).getProvinceName();
            if (cityName.equals(city.getCityName()) && provinceName.equals(city.getProvinceName())) {
                cities.remove(i);
                return true;
            }
        }
        return false;
    }

    public int countCity() {
        return cities.size();
    }
}
