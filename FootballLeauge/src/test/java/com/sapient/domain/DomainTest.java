package com.sapient.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import com.sapient.leauge.domain.Country;

public class DomainTest {
	
	Country country = new Country();
	
	@BeforeTestMethod
	public void setUp() {
		
		country.setCountryId(43);
		country.setCountryName("England");
	}
	
	@Test
	public void getcountryDetailsTest() {
		
		assertEquals(country.getCountryId(), 43);
		assertEquals(country.getCountryName(), "England");
		
	}

	
}
