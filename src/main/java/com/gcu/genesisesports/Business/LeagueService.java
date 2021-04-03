package com.gcu.genesisesports.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.genesisesports.Data.LeagueDataService;
import com.gcu.genesisesports.Model.League;

@Service
public class LeagueService {
	
	@Autowired
	private LeagueDataService leagueRepo;
	
	public LeagueService(LeagueDataService leagueRepo) {
		this.leagueRepo = leagueRepo;
	}
	
	public List<League> findAll(){
		return leagueRepo.findAll();
	}
	
	public Optional<League> findById(String id){
		return leagueRepo.findById(id);
	}
	
	public League save(League league) {
		return leagueRepo.save(league);
	}
	
	public void deleteById(String Id) {
		leagueRepo.deleteById(Id);
	}
}
