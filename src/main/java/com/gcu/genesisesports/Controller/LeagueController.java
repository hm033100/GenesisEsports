package com.gcu.genesisesports.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.genesisesports.Business.LeagueService;
import com.gcu.genesisesports.Model.League;

/**
 * GenesisEsports Backend
 * CST-452 Professor Reha
 * League Controller
 * @author Hermes Mimini
 * @version 1.0
 * {@summary This class is the REST Service point for all the CRUD league functionality.}
 *
 */

//Define class and set up the CrossOrigin point to allow the clientside website access to the RestService
//Set as a controller
//Set the mapping to the REST Function
@CrossOrigin
@RestController
@RequestMapping(value = "/leagues")
public class LeagueController {

	//Define the leagueService object that will be injected in the controller
	@Autowired
	private final LeagueService leagueService;
	
	/**
	 * This function will inject the league service to the controller
	 * @param leagueService - The league service
	 */
	public LeagueController(LeagueService leagueService) {
		this.leagueService = leagueService;
	}
	
	/**
	 * This function will call the businessService of the league and 
	 * return a list of all the leagues in the database
	 * @return - Array<Leagues> - List of leagues
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<League> getAll(){
		return leagueService.findAll();
	}
	
	/**
	 * This function will call the businessLayer to return a league that 
	 * is specific to the ID in the POST Request
	 * @param json - JSON data that has the id of the league
	 * @return - League - The league that corresponds to the ID
	 */
	@RequestMapping(value = "/id", method=RequestMethod.POST)
	public Optional<League> viewById(@RequestBody Map<String, String> json){
		String _id = json.get("_id");
		return leagueService.findById(_id);
	}
	
	/**
	 * This function will create/edit the league that is sent to it 
	 * in the POST request
	 * @param league - The league that has the changes
	 * @return - League with the changes
	 */
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public League save(@RequestBody League league) {
		return leagueService.save(league);
	}
	
	/**
	 * This function will use the businessLayer and delete a league
	 * based on the ID that is sent in JSON
	 * @param json - JSON data that has the league ID
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void deleteById(@RequestBody Map<String, String> json) {
		String _id = json.get("_id");
		leagueService.deleteById(_id);
	}
	
}
