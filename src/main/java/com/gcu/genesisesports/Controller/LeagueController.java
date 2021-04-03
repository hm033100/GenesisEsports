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

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/leagues")
public class LeagueController {

	@Autowired
	private final LeagueService leagueService;
	
	public LeagueController(LeagueService leagueService) {
		this.leagueService = leagueService;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<League> getAll(){
		return leagueService.findAll();
	}
	
	@RequestMapping(value = "/id", method=RequestMethod.POST)
	public Optional<League> viewById(@RequestBody Map<String, String> json){
		String _id = json.get("_id");
		return leagueService.findById(_id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public League save(@RequestBody League league) {
		return leagueService.save(league);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void deleteById(@RequestBody String Id) {
		leagueService.deleteById(Id);
	}
	
}
