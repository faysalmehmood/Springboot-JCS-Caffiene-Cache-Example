package com.example.demo.services.parsing;

import com.example.demo.repositories.parsing.IsoMsgFieldsRepo;
import com.example.demo.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fmehmood
 * @since June, 19 2019
 */

@Service
public class DatabaseService implements BaseService {

	@Autowired IsoMsgFieldsRepo isoMsgFieldsRepo;

	public void loadBasicData(){
		isoMsgFieldsRepo.findAll();
		System.out.println("Here");
	}
}
