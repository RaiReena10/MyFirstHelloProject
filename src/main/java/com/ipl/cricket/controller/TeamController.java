package com.ipl.cricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.cricket.entity.Team;
import com.ipl.cricket.repository.MatchRepository;
import com.ipl.cricket.repository.TeamRepository;

@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepo;

	@Autowired
	private MatchRepository matchRepo;
	//To get the team
	@GetMapping(value = "/team/{teamName}")
	public Team getTeam(@PathVariable String teamName) {
		
		Team team = teamRepo.findByTeamName(teamName);
		team.setAllMatches(matchRepo.getLatestMatchList(teamName, 4));
		
		System.out.println("Changes done in Master :");

		return team;

	}

}
