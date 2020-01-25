package com.sapient.leauge.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sapient.leauge.domain.Country;
import com.sapient.leauge.exception.CountryNotFoundException;
import com.sapient.leauge.response.Position;

@RestController
public class LeaugePositionController {
	
	static Logger logger = Logger.getLogger(LeaugePositionController.class);
    
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${service.api.key}")
	private String apiKey;
	
	@Value("${service.api.url}")
	private String serviceUrl;
	

	@Value("${service.api.countries.action}")
	private String countriesAction;
	
	@RequestMapping(value="/position/get/{countryId}", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody Position getLeaugePosition(@PathVariable("countryId") long countryId) throws CountryNotFoundException{
		
		PropertyConfigurator.configure("log4j.properties");
		
	    logger.debug("Calling getLeaugePosition.. ");
						
		final String countryServiceUrl = new String (serviceUrl + "?action=" + countriesAction + "&APIkey=" +apiKey);
		
		logger.debug("Calling Country external service... ");
		
		ResponseEntity<Country[]> response  = restTemplate.getForEntity(countryServiceUrl, Country[].class);
		
		Country[] countries = response.getBody();
		
		Position position = new Position(); 
		
		for(Country country : countries) {
				
			if(country.getCountryId() == countryId ) {
				position.setCountryId(countryId); 
			    position.setCountryName(country.getCountryName());
			    
				// Call other API to get details for the country and logic to calculate the other parameters 
			    
			    position.setLeaugeId(1L);
			
			}else {
				throw new CountryNotFoundException("Country not found for provided country id");
			}
		}
		
		return position;
	}
}
