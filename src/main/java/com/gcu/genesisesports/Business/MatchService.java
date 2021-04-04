package com.gcu.genesisesports.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.genesisesports.Data.MatchDataService;
import com.gcu.genesisesports.Model.Match;

@Service
public class MatchService {
	
	@Autowired
	private MatchDataService matchRepo;
	
	public MatchService(MatchDataService matchRepo) {
		this.matchRepo = matchRepo;
	}
	
	public List<Match> findAll(){
		return matchRepo.findAll();
	}
	
	public Optional<Match> findById(String id){
		return matchRepo.findById(id);
	}
	
	public Match save(Match league) {
		return matchRepo.save(league);
	}
	
	public void deleteById(String Id) {
		matchRepo.deleteById(Id);
	}

}
