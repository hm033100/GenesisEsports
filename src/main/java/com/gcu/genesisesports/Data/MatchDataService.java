package com.gcu.genesisesports.Data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gcu.genesisesports.Model.Match;

@Repository

public interface MatchDataService extends MongoRepository<Match, String> {

}