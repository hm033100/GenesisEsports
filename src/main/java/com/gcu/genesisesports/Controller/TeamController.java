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

import com.gcu.genesisesports.Business.TeamService;
import com.gcu.genesisesports.Model.Team;

/**
 * GenesisEsports Backend
 * CST-452 Professor Reha
 * User Controller
 * @author Hermes Mimini
 * @version 1.0
 * {@summary This class will set up the REST API in order to take and send information as an application.}
 *
 */

@CrossOrigin(origins = "https://master.d2la0zth04pcwu.amplifyapp.com")
@RestController
@RequestMapping(value = "/teams")
public class TeamController {
	
		//teamService - TeamService: Object to send and receive information from the database.
		@Autowired
		private final TeamService teamService;
		
		/**
		 * The constructor that will inject the Team Service using dependency injection.
		 * 
		 * @param teamService - UserService: Object that communicates with the MongoDB database Object
		 */
		public TeamController(TeamService teamService) {
			this.teamService = teamService;
		}
		
		/**
		 * getAll - Method that will return a list of all the teams in the database.
		 * 
		 * @return List<Team> - A list of all the teams in the database
		 */
		@RequestMapping(value = "", method = RequestMethod.GET)
		public List<Team> getAll() {
			return teamService.findAll();
		}
		
		/**
		 * findByID - POST Request that will return a team from the database based on the ID that was sent.
		 * 
		 * @param json - Map<String, String>: JSON string that contains a team ID
		 * @return Optional<Team> - Contains all parameters and functions of the Team Model.
		 */
		@RequestMapping(value = "/id", method=RequestMethod.POST)
		public Optional<Team> viewById(@RequestBody Map<String, String> json) {
			String _id = json.get("_id");
			return teamService.findById(_id);
		}
		
		/**
		 * save - HTTP POST request which will add/update a team in the database
		 * @param user - Team Object - Contains all parameters and functions of the Team Model.
		 * @return user - Team Object - Contains all parameters and functions of the Team Model.
		 */
		@RequestMapping(value="/save", method=RequestMethod.POST)
		public Team save(@RequestBody Team team) {
			return teamService.save(team);
		}
		
		/**
		 * deleteById - HTTP POST request that contains the teams ID in the Request Body and will delete that specific team from the database.
		 * @param Id The ID of the Team
		 */
		@RequestMapping(value="/delete", method=RequestMethod.POST)
		public void deleteById(@RequestBody Map<String, String> json){
			String _id = json.get("_id");
			teamService.deleteById(_id);
		}

}
