package com.sample.service.impl;


import com.sample.dao.CityDao;
import com.sample.domain.City;
import com.sample.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao2;
    @Override
    public City findCityByName(String cityName) {
        return cityDao2.findByName(cityName);
    }
}
