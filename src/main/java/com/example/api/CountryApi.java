package com.example.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import service.CountryService;

@RestController
public class CountryApi {
	
	@Autowired CountryService countryService;
	
	@GetMapping(value="/count_country")
	public Long countCountry() {
		return countryService.countCountry();
	}
}
