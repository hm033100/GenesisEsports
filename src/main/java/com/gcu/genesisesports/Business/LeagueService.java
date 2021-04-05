package com.gcu.genesisesports.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.genesisesports.Data.LeagueDataService;
import com.gcu.genesisesports.Model.League;
/*
* Genesis Esports Backend
* CST-452 Professor Reha
* League Service (Business Layer)
* @author Hermes Mimini
* @version 1.0
* {@summary League Service is the business layer of the project, it allows the project to have a middle-layer.}
*
*/
@Service
public class LeagueService {
	
	//Create a DataService it inject into the LeagueService
	@Autowired
	private LeagueDataService leagueRepo;
	
	//Inject the Data Service
	public LeagueService(LeagueDataService leagueRepo) {
		this.leagueRepo = leagueRepo;
	}
	
	/**
	 * This function will call the dataService and return a list of 
	 * all the Leagues in the DataBase
	 * @return
	 */
	public List<League> findAll(){
		return leagueRepo.findAll();
	}
	
	/**
	 * This function will find a league when given an ID
	 * @param id - The id of the league that is searched
	 * @return League - The league that has the ID given
	 */
	public Optional<League> findById(String id){
		return leagueRepo.findById(id);
	}
	
	/**
	 * This function will edit/create a league to the database.
	 * @param league - The league that will be saved
	 * @return League - The league that was saved
	 */
	public League save(League league) {
		return leagueRepo.save(league);
	}
	
	/**
	 * This function will delete a a league by the ID that is given
	 * @param Id - ID of league that is going to be deleted
	 */
	public void deleteById(String Id) {
		leagueRepo.deleteById(Id);
	}
}
