package com.ipl.cricket.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

// I am in a bug fix branch
@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String teamName;
	private Long totalMatches;
	private Long totalWins;
	@Transient
	private List<Match> allMatches;

	public Team() {

	}

	public Team(String teamName, Long totalMatches) {

		this.teamName = teamName;
		this.totalMatches = totalMatches;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Long getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(Long totalMatches) {
		this.totalMatches = totalMatches;
	}

	public Long getTotalWins() {
		return totalWins;
	}

	public void setTotalWins(Long totalWins) {
		this.totalWins = totalWins;
	}

	public List<Match> getAllMatches() {
		return allMatches;
	}

	public void setAllMatches(List<Match> allMatches) {
		this.allMatches = allMatches;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", totalMatches=" + totalMatches + ", totalWins=" + totalWins + "]";
	}

}
