package com.sapient.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sapient.leauge.response.Position;

public class LeaugePositionControllerTest {

	@Test
	public void testGetLeaugePosition() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:8081//position/get/41";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<Position> result = restTemplate.getForEntity(uri, Position.class);
	     
	    //Verify request succeed
	    assertEquals(200, result.getStatusCodeValue());
	}
}
