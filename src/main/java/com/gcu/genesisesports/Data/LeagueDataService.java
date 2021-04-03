package com.gcu.genesisesports.Data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gcu.genesisesports.Model.League;

/**
 * GenesisEsports Backend
 * CST-452 Professor Reha
 * UserDataService
 * @author Hermes Mimini
 * @version 1.0
 * {@summary This class will set up the connection to MongoDB which is a NoSQL Database.}
 *
 */

@Repository

public interface LeagueDataService extends MongoRepository<League, String> {

}
