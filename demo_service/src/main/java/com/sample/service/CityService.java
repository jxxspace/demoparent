package com.sample.service;



import com.github.pagehelper.PageInfo;
import com.sample.domain.City;

import java.util.List;


public interface CityService {
   City findCityByName(String cityName);

    PageInfo findAll(int pageNumInt, int pagesizeInt);
}
