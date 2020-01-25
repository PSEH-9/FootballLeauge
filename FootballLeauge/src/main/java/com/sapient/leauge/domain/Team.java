package com.sapient.leauge.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Team {
	
	private long teamKey;
	
	private String teamName;
	
	private String teamBadge;
	
	@Setter
	private List<Player> playerList;
	

}
