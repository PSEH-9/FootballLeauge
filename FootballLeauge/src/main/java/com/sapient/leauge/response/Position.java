package com.sapient.leauge.response;

import java.io.Serializable;

import org.springframework.cache.annotation.Cacheable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Setter
@EqualsAndHashCode
@Cacheable
public class Position implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long countryId;
	private String countryName;
	
	private long leaugeId;
	private String leaugeName;
	
	private long teamId;
	private String teamName;
	
	private long overallLeaugePosition;

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

	public long getLeaugeId() {
		return leaugeId;
	}

	public void setLeaugeId(long leaugeId) {
		this.leaugeId = leaugeId;
	}

	public String getLeaugeName() {
		return leaugeName;
	}

	public void setLeaugeName(String leaugeName) {
		this.leaugeName = leaugeName;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public long getOverallLeaugePosition() {
		return overallLeaugePosition;
	}

	public void setOverallLeaugePosition(long overallLeaugePosition) {
		this.overallLeaugePosition = overallLeaugePosition;
	}
	
	
	
	
}
