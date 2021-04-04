package com.gcu.genesisesports.Model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection = "Leagues")
public class League {
	
	@Id
	private String _id;
	
	@NonNull
	private String leagueName;
	
	@NonNull
	private Boolean isLocked;
	
	@NonNull
	private Boolean isFinished;
	
	@NonNull
	private ArrayList<String> teamsId;

	public String get_id() {
		return _id;
	}
	
	public Boolean getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}

	public void setTeamsId(ArrayList<String> teamsId) {
		this.teamsId = teamsId;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	
	public ArrayList<String> getTeamsId() {
		return teamsId;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public League(String _id, Boolean isFinished, String leagueName, Boolean isLocked, ArrayList<String> teamsId){
		super();
		this._id = _id;
		this.isFinished = isFinished;
		this.leagueName = leagueName;
		this.isLocked = isLocked;
		this.teamsId = teamsId;
	}

	public League() {
		super();
	}
	
	
	

}
