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

import com.gcu.genesisesports.Business.MatchService;
import com.gcu.genesisesports.Model.Match;

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
@RequestMapping(value = "/matches")
public class MatchController {

	//Define the matchService that will be injected in the controller
	@Autowired
	private final MatchService matchService;
	
	/**
	 * This function will inject the service to the controller
	 * @param matchService - Service that will be injected
	 */
	public MatchController(MatchService matchService) {
		this.matchService = matchService;
	}
	
	/**
	 * This function will use the service and return a list of 
	 * all the matches in the database
	 * @return Array<Matches> -  List of all the matches in the database
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Match> getAll(){
		return matchService.findAll();
	}
	
	/**
	 * This function will use the service to return a Match object based on the ID that is sent in 
	 * in JSON format
	 * @param json - ID of the Match 
	 * @return - Match Object
	 */
	@RequestMapping(value = "/id", method=RequestMethod.POST)
	public Optional<Match> viewById(@RequestBody Map<String, String> json){
		String _id = json.get("_id");
		return matchService.findById(_id);
	}
	
	/**
	 * This function will create/edit the match that is sent to it 
	 * in the POST request
	 * @param match - The match that has the changes
	 * @return - Match with the changes
	 */
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Match save(@RequestBody Match match) {
		return matchService.save(match);
	}
	
	/**
	 * This function will use the businessLayer and delete a match
	 * based on the ID that is sent in JSON
	 * @param json - JSON data that has the match ID
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void deleteById(@RequestBody Map<String, String> json) {
		String _id = json.get("_id");
		matchService.deleteById(_id);
	}
	
}
