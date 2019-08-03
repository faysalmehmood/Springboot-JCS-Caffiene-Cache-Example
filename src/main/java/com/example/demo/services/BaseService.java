package com.example.demo.services;

import com.example.demo.repositories.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {
    protected static final String CLASS_NAME = JCSCacheService.class.getName();
    protected static final Logger LGR = LoggerFactory.getLogger(CLASS_NAME);


    @Autowired
    CityRepository cityRepository;
}
