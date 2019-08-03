package com.example.demo.startup;

import com.example.demo.services.CaffieneCacheService;
import com.example.demo.services.JCSCacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Calendar;

/**
 * @author fmehmood
 * @since June, 19 2019
 */

@Component
public class Initializer {

	private static final String CLASS_NAME = Initializer.class.getName();

	private static final Logger LGR = LoggerFactory.getLogger(CLASS_NAME);

	@Autowired
	JCSCacheService JCSCacheService;

	@Autowired
	CaffieneCacheService caffieneCacheService;

	@PostConstruct
	public void init() {
		final java.util.Date now = Calendar.getInstance().getTime();
		LGR.info(LGR.isInfoEnabled() ? "--------------------------------------------------------" : null);
		LGR.info(LGR.isInfoEnabled() ? "----------    APPLICATION IS STARTED    ----------------" : null);
		LGR.info(LGR.isInfoEnabled() ? "--------------------------------------------------------" : null);


		LGR.info(LGR.isInfoEnabled() ? "Starting Caching Data" : null);

		cacheDatabaseTable();

		LGR.info(LGR.isInfoEnabled() ? "Ending Caching Data" : null);
	}


	private void cacheDatabaseTable() {
		caffieneCacheService.initCaching();
	}}
