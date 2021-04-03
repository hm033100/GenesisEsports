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
	private ArrayList<Match> matches;

	public String get_id() {
		return _id;
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

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public ArrayList<Match> getMatches() {
		return matches;
	}

	public void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
	}

	public League(String _id, String leagueName, Boolean isLocked, ArrayList<Match> matches) {
		super();
		this._id = _id;
		this.leagueName = leagueName;
		this.isLocked = isLocked;
		this.matches = matches;
	}

	public League() {
		super();
	}
	
	
	

}
