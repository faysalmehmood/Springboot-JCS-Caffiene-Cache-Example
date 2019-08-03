package com.example.demo.services;

import com.example.demo.models.City;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class CaffieneCacheService extends BaseService {

    private static Cache<String, City> cache = Caffeine.newBuilder()
            .expireAfterWrite(1, TimeUnit.MINUTES)
            .maximumSize(100)
            .build();



    public void initCaching() {
        cacheTable();
    }


    public void cacheTable() {
        List<City> cities = cityRepository.findAll();
        if (null != cities && cities.size() > 0) {
            cache.cleanUp();
            cities.forEach(city -> cache.put(city.getName(), city));
        }
    }

}
