package com.ipl.cricket.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import com.ipl.cricket.entity.Match;
import com.ipl.cricket.entity.Matchinput;

public class MatchProcessor implements ItemProcessor<Matchinput, Match> {

	private static final Logger log = LoggerFactory.getLogger(MatchProcessor.class);

	@Override
	public Match process(final Matchinput matchInput) throws Exception {
		Match match = new Match();
		match.setId(Long.parseLong(matchInput.getId()));
		match.setDate(LocalDate.parse(matchInput.getDate()));
		match.setCity(matchInput.getCity());
		match.setVenue(matchInput.getVenue());
		match.setNeutralVenue(matchInput.getNeutral_venue());
		match.setTeam1(matchInput.getTeam1());
		match.setTeam2(matchInput.getTeam2());
		match.setTossWinner(matchInput.getToss_winner());
		match.setWinner(matchInput.getWinner());
		match.setResult(matchInput.getResult());
		match.setResultMargin(matchInput.getResult_margin());
		match.setEliminator(matchInput.getEliminator());
		match.setMethod(matchInput.getMethod());
		match.setUmpire1(matchInput.getUmpire1());
		match.setUmpire2(matchInput.getUmpire2());
		
		

		return match;
	}

}