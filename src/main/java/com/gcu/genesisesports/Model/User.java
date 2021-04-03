package com.gcu.genesisesports.Model;

import org.springframework.lang.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {
	
	//Id - String: The ID generated from MongoDB for the User
	@Id
	private String _id;
	
	private String team_id;
	
	//firstName - String: The First Name of the User.
	@NonNull
	private String firstName;
	
	//lastName - String: The Last Name of the User.
	@NonNull
	private String lastName;
	
	//email - String: The Email of the User.
	@NonNull
	private String email;
	
	//phoneNumber - String: The phoneNumber of the User.
	@NonNull
	private String phoneNumber;
	
	//game - String: The favorite game of the User.
	@NonNull
	private String game;
	
	//username - String: The Username of the User.
	@NonNull
	private String username;
	
	//password - String: The Password of the User.
	@NonNull
	private String password;

	/**
	 * Return the ID of the User
	 * @return Id - User ID
	 */
	public String get_id() {
		return _id;
	}
	
	/**
	 * Set the ID of the User (Should never be Used)
	 * @param id - User ID
	 */
	public void setId(String _id) {
		this._id = _id;
	}

	/**
	 * Return users first name.
	 * @return firstName - The users first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the users first name 
	 * @param firstName - String: Users first name 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Return the users last name. 
	 * @return lastName - The users last name.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name of the user.
	 * @param lastName - String: Users last name.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Return the email of the user.
	 * @return email - The users email.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set the email of the user.
	 * @param email - String: Email of the user.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Return the phone number of the user.
	 * @return phoneNumber - String
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Set the phone number of the user
	 * @param phoneNumber - String: Users phone number.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Return the game of the user.
	 * @return game - String
	 */
	public String getGame() {
		return game;
	}

	/**
	 * Set the game of the user.
	 * @param game - String: The game of the user.
	 */
	public void setGame(String game) {
		this.game = game;
	}

	/**
	 * Return the username of the user.
	 * @return username - String
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the Username of the user.
	 * @param username - String: Username of the user
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Return the password of the user
	 * @return password - String.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password of the user.
	 * @param password - String: Password of the user
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This constructor will create a user Object by taking in all the following variables.
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNumber
	 * @param game
	 * @param username
	 * @param password
	 */
	public User(String _id, String firstName, String lastName, String email, String phoneNumber, String game,
			String username, String password) {
		super();
		this._id = _id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.game = game;
		this.username = username;
		this.password = password;
	}

	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	
}
