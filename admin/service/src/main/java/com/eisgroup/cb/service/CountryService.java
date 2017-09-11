package com.eisgroup.cb.service;

import com.eisgroup.cb.model.Country;

import java.util.List;
import java.util.Map;

/**
 * Created by Titarenko on 25.05.2017 at 13:56.
 */
public interface CountryService {
    List<Country> getAllCountriesList();

    Map<String, Country> getAllCountriesMap();

    Country getCountryByName(String countryName);

    Country getCountryById(long id);
}
