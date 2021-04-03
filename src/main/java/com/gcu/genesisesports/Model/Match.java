package com.gcu.genesisesports.Model;

import org.springframework.data.annotation.Id;

import com.mongodb.lang.NonNull;

public class Match {
	
	//This variable is the ID of the Match 
	@Id
	private String _id;
	
	//The ID of the first team
	@NonNull
	private String firstTeamId;
	
	//The ID of the second team
	@NonNull 
	private String secondTeamId;
	
	//The ID of the winner team
	@NonNull 
	private String winnerTeamId; 
	
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

	public String getFirstTeamId() {
		return firstTeamId;
	}

	public void setFirstTeamId(String firstTeamId) {
		this.firstTeamId = firstTeamId;
	}

	public String getSecondTeamId() {
		return secondTeamId;
	}

	public void setSecondTeamId(String secondTeamId) {
		this.secondTeamId = secondTeamId;
	}

	public String getWinnerTeamId() {
		return winnerTeamId;
	}

	public void setWinnerTeamId(String winnerTeamId) {
		this.winnerTeamId = winnerTeamId;
	}

	public int getGamePriority() {
		return gamePriority;
	}

	public void setGamePriority(int gamePriority) {
		this.gamePriority = gamePriority;
	}

	public Match(String _id, String firstTeamId, String secondTeamId, String winnerTeamId, int gamePriority) {
		super();
		this._id = _id;
		this.firstTeamId = firstTeamId;
		this.secondTeamId = secondTeamId;
		this.winnerTeamId = winnerTeamId;
		this.gamePriority = gamePriority;
	}

	public Match() {
		super();
	}
	
	
	
	

}
