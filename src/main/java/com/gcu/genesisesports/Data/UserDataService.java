package com.gcu.genesisesports.Data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.gcu.genesisesports.Model.User;

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

public interface UserDataService extends MongoRepository<User, String> {
	
	/**
	 * findByUsernameAndPassword is a custom query method for MongoDB, it will return a full user from the database on  a specified Username and Password
	 * @param username - String: the username of the user
	 * @param password - String: the password of the user
	 * @return
	 */
	@Query("{'username': ?0, 'password': ?1}")
	public User findByUsernameAndPassword(String username, String password);
	
}
