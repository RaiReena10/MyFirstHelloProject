package com.ipl.cricket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipl.cricket.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
	
	public Team findByTeamName(String teamName);

}