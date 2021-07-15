package com.ipl.cricket.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipl.cricket.entity.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long>{
	
	public List<Match> findByTeam1OrTeam2OrderByDateDesc(String team1,String team2,Pageable pagable);
	
	default public List<Match> getLatestMatchList(String teamName, int count)
	{
		return findByTeam1OrTeam2OrderByDateDesc(teamName,teamName,Pageable.ofSize(count));
		
	}
	
	default public List<Match> getLatestMatchList1(String teamName, int count)
	{
		return findByTeam1OrTeam2OrderByDateDesc(teamName,teamName,Pageable.ofSize(count));
		
	}
	
	

}
