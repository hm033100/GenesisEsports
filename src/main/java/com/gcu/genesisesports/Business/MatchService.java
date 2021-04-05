package com.gcu.genesisesports.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.genesisesports.Data.MatchDataService;
import com.gcu.genesisesports.Model.Match;

/*
* Genesis Esports Backend
* CST-452 Professor Reha
* Team Service (Business Layer)
* @author Hermes Mimini
* @version 1.0
* {@summary Match Service is the business service for the Match model and handles all the 
* 	logic that connects to the data service.}
*
*/
@Service
public class MatchService {
	
	//Set up a MatchDataService variable to inject to the MatchService
	@Autowired
	private MatchDataService matchRepo;
	
	/**
	 * This function will inject the data service to the MatchService
	 * @param matchRepo - Data Service
	 */
	public MatchService(MatchDataService matchRepo) {
		this.matchRepo = matchRepo;
	}
	
	/**
	 * This function will return a list of all the 
	 * matches in the database
	 * @return Array<Match> - Array of all matches
	 */
	public List<Match> findAll(){
		return matchRepo.findAll();
	}
	
	/**
	 * This function will find a Match based on the ID that is sent in
	 * and return it
	 * @param id - The Id of the match
	 * @return Match - Match Object
	 */
	public Optional<Match> findById(String id){
		return matchRepo.findById(id);
	}
	
	/**
	 * This function will edit/create the match object sent and 
	 * put it in the database.
	 * @param Match - Match that will be edited/created in the database
	 * @return - The match object that was upserted
	 */
	public Match save(Match match) {
		return matchRepo.save(match);
	}
	
	/**
	 * This function will delete a match based on the ID that is sent
	 * @param Id - The ID of the match that needs to be deleted
	 */
	public void deleteById(String Id) {
		matchRepo.deleteById(Id);
	}

}
