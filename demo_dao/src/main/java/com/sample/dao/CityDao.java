package com.sample.dao;


import com.sample.domain.City;
import org.apache.ibatis.annotations.Param;


public interface CityDao {
    City findByName(@Param("cityName") String cityName);
}
