package com.junners.controller;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.junners.entity.Airport;
import com.junners.repository.AirportDAO;
import com.junners.view.AirportListView;
import com.junners.view.AirportView;
import com.junners.view.form.SearchForm;

@Controller
public class AirportController {
	
	@Autowired
	private AirportDAO airportDAO;
	
	@GetMapping("/")
	public String landing(Model model) {
		//initialize input form
		SearchForm searchParameters = new SearchForm();
		
		List<Airport> airportList = airportDAO.findAll();
		int size = airportList.size();
		DozerBeanMapper mapper = new DozerBeanMapper();
		AirportListView avl = new AirportListView();
		for(int index = 0; index < size; index++) {
			AirportView av = mapper.map(airportList.get(index), AirportView.class);
			av.setId(index);
			avl.addAirport(av);
			System.out.println(av.toString());
		}
		
		System.out.println("Size = " + avl.getAvl().size());
		model.addAttribute("searchForm", searchParameters);
		model.addAttribute("airportList", avl.getAvl());
		return "LandingPage";
	}
	
	
	@PostMapping("/")	
	public String submitForm(@ModelAttribute SearchForm searchForm) {
		System.out.println("Input from screen is:" +searchForm.getDestination());
		return "LandingPage";
	}
}
