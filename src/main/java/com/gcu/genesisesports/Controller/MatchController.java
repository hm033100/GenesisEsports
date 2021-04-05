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


@CrossOrigin
@RestController
@RequestMapping(value = "/matches")
public class MatchController {

	@Autowired
	private final MatchService matchService;
	
	public MatchController(MatchService matchService) {
		this.matchService = matchService;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Match> getAll(){
		return matchService.findAll();
	}
	
	@RequestMapping(value = "/id", method=RequestMethod.POST)
	public Optional<Match> viewById(@RequestBody Map<String, String> json){
		String _id = json.get("_id");
		return matchService.findById(_id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Match save(@RequestBody Match match) {
		return matchService.save(match);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void deleteById(@RequestBody Map<String, String> json) {
		String _id = json.get("_id");
		matchService.deleteById(_id);
	}
	
}
