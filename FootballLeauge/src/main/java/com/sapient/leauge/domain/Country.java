package com.sapient.leauge.domain;

import org.springframework.cache.annotation.Cacheable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Cacheable
@Data
public class Country{
		
	@Getter(AccessLevel.PUBLIC)
	private long countryId;
	
		
	public long getCountryId() {
		return countryId;
	}



	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}



	public String getCountryName() {
		return countryName;
	}



	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}



	private String countryName;
	
}
