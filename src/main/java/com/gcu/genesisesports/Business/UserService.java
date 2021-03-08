package com.gcu.genesisesports.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.genesisesports.Data.UserDataService;
import com.gcu.genesisesports.Model.User;

/**
 * Genesis Esports Backend
 * CST-452 Professor Reha
 * User Service (Business Layer)
 * @author Hermes Mimini
 * @version 1.0
 * {@summary User Service is the business layer of the project, it allows the project to have a middle-layer.}
 *
 */

@Service
public class UserService {
	
	//userRepo - User Data Service, DAO that will provide the methods to connect to MongoDB
	@Autowired
	private UserDataService userRepo;
	
	/**
	 * User Service Constructor to inject the DAO
	 * @param userRepo - UserDataService: Data Access Object
	 */
	public UserService(UserDataService userRepo) {
		this.userRepo = userRepo;
	}
	
	
	/**
	 * findAll will make a request to the data service and will grab all the users from the DB
	 * @return
	 */
	public List<User> findAll() {
		return userRepo.findAll();
	}
	
	/**
	 * findById will take a unique ID and return a list of users that have that ID
	 * @param id - String: The ID of a user that is generated
	 * @return users - Optional<User>: A list of users that comes from the database
	 */
	public Optional<User> findById(String id) {
		return userRepo.findById(id);
	}
	
	/**
	 * save - This method is considered to be the insert/create/update because thats how MongoDB will operate.
	 * @param user - The user object.
	 * @return User - User Object
	 */
	public User save(User user) {
		return userRepo.save(user);
	}
	
	/**
	 * deleteById - This method will delete a User from the database given the unique ID
	 * @param Id - The ID of the User
	 */
	public void deleteById(String Id){
		userRepo.deleteById(Id);
	}
	
	/**
	 * validate - This method will take a User model and use the DAO function to validate the user
	 * @param user - The user object.
	 * @return User - User Object
	 */
	public User validate(User user) {
		return userRepo.findByUsernameAndPassword(user.getUsername(), 
												  user.getPassword());
	}
}
