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

import com.gcu.genesisesports.Business.UserService;
import com.gcu.genesisesports.Model.User;

/**
 * GenesisEsports Backend
 * CST-452 Professor Reha
 * User Controller
 * @author Hermes Mimini
 * @version 1.0
 * {@summary This class will set up the REST API in order to take and send information as an application.}
 *
 */


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	//userService - UserService: Object to send and receive information from the database.
	@Autowired
	private final UserService userService;
	
	/**
	 * The constructor that will inject the User Service using dependency injection.
	 * 
	 * @param userService - UserService: Object that communicates with the MongoDB database Object
	 */
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * getAll - Method that will return a list of all the users in the database.
	 * 
	 * @return\List<User> - A list of all the users in the database
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getAll() {
		return userService.findAll();
	}
	
	/**
	 * validate - Method that will take the credentials of a User and are sent to the user service and user data service to be validated.
	 * @param user - User Object - Contains all parameters and functions of the User Model.
	 * @return user - User Object - Contains all parameters and functions of the User Model.
	 */
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public User validate(@RequestBody User user) {
		return userService.validate(user);
	}
	
	/**
	 * findByID - POST Request that will return a user from the database based on the ID that was sent.
	 * 
	 * @param json - Map<String, String>: JSON string that contains a entry's _id
	 * @return Optional<User> - Contains all parameters and functions of the User Model.
	 */
	@RequestMapping(value = "/id", method=RequestMethod.POST)
	public Optional<User> viewById(@RequestBody Map<String, String> json) {
		String _id = json.get("_id");
		return userService.findById(_id);
	}
	
	/**
	 * save - HTTP POST request which will add/update a user in the database
	 * @param user - User Object - Contains all parameters and functions of the User Model.
	 * @return user - User Object - Contains all parameters and functions of the User Model.
	 */
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public User save(@RequestBody User user) {
		return userService.save(user);
	}
	
	/**
	 * deleteById - HTTP POST request that contains the users ID in the Request Body and will delete that specific user from the database.
	 * @param Id The ID of the User
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void deleteById(@RequestBody String Id){
		userService.deleteById(Id);
	}

}
	