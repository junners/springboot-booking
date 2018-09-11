package com.junners.datainit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.junners.entity.Airport;
import com.junners.repository.AirportDAO;

@Component
public class AirportDataInit implements ApplicationRunner{
	
	private AirportDAO airportDAO;
	
	@Autowired
	public AirportDataInit (AirportDAO airportDAO) {
		this.airportDAO = airportDAO;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = airportDAO.count();
		
		if (count == 0L) {
			Airport mnl = new Airport("MNL", "Ninoy Aquino International Airport");
			Airport hkg = new Airport("HKG", "Hongkong International Airport");
			
			airportDAO.save(mnl);
			airportDAO.save(hkg);
		}
		
	}
	
	
	
	
}
