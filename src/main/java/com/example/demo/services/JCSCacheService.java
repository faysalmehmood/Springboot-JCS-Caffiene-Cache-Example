package com.example.demo.services;

import com.example.demo.models.City;
import org.apache.commons.jcs.JCS;
import org.apache.commons.jcs.access.CacheAccess;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fmehmood
 * @since June, 19 2019
 */

@Service @EnableScheduling
public class JCSCacheService  extends BaseService{

	private static CacheAccess<String, City> cache = JCS.getInstance("default");


/*	@Scheduled(fixedDelay = 100)
	public void initCaching() {
		cacheTable();
	}*/


	public void cacheTable() {
		List<City> cities = cityRepository.findAll();
		LGR.info("Table City Data: " + cities);

		if(null != cities && cities.size() > 0){
			cache.clear();
			cities.forEach(city -> cache.put(city.getName(), city));
		}
		System.out.println(cache.get("Lahore"));
	}

}
