package com.gcu.genesisesports.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection = "Matches")
public class Match {
	
	//This variable is the ID of the Match 
	@Id
	private String _id;
	
	@NonNull
	private League league;
	
	//The ID of the first team
	@NonNull
	private Team firstTeam;
	
	//The ID of the second team
	@NonNull 
	private Team secondTeam;
	
	//The ID of the winner team
	@NonNull 
	private Team winnerTeam; 
	
	//This integer will determine the priority of the game
	//The smaller the number the higher the priority
	@NonNull
	private int gamePriority;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public Team getFirstTeam() {
		return firstTeam;
	}

	public void setFirstTeam(Team firstTeam) {
		this.firstTeam = firstTeam;
	}

	public Team getSecondTeam() {
		return secondTeam;
	}

	public void setSecondTeam(Team secondTeam) {
		this.secondTeam = secondTeam;
	}

	public Team getWinnerTeam() {
		return winnerTeam;
	}

	public void setWinnerTeam(Team winnerTeam) {
		this.winnerTeam = winnerTeam;
	}

	public int getGamePriority() {
		return gamePriority;
	}

	public void setGamePriority(int gamePriority) {
		this.gamePriority = gamePriority;
	}

	public Match(String _id, League league, Team firstTeam, Team secondTeam, Team winnerTeam, int gamePriority) {
		super();
		this._id = _id;
		this.league = league;
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.winnerTeam = winnerTeam;
		this.gamePriority = gamePriority;
	}

	public Match() {
		super();
	}
	
	
	
	

}
