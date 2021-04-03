package com.gcu.genesisesports.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection = "Teams")
public class Team {
	
		//_id - String: The ID generated from MongoDB for the Team
		@Id
		private String _id;
		
		//_id - String: The ID generated from MongoDB for the Team
		@NonNull
		private String ownerID;

		//teamName - String: The Team Name
		@NonNull
		private String teamName;
		
		//clubTag - String: The Team Club Tag
		@NonNull
		private String clubTag;
		
		//teamWins - Int: Amount of team wins
		@NonNull
		private int teamWins;
		
		//teamLosses - Int: Amount of team losses
		@NonNull
		private int teamLosses;
		
		
		/**
		 * Get the ID of the team
		 * @return The Team ID
		 */
		public String get_id() {
			return _id;
		}



		/**
		 * Set the ID of the team
		 * @param _id The team ID
		 */
		public void set_id(String _id) {
			this._id = _id;
		}
		
		/**
		 * Get the ID of the team owner
		 * @return The Team Owner ID
		 */
		public String getOwnerID() {
			return ownerID;
		}


		/**
		 * Set the ID of the team owner
		 * @param _id The team owner ID
		 */
		public void setOwnerID(String ownerID) {
			this.ownerID = ownerID;
		}


		/**
		 * Get the Team Name
		 * @return The team Name
		 */
		public String getTeamName() {
			return teamName;
		}

		/**
		 * Set the team Name
		 * @param teamName - The team name
		 */
		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}


		/**
		 * Get the team club tag
		 * @return The team club tag
		 */
		public String getClubTag() {
			return clubTag;
		}


		/**
		 * Set the team club tag
		 * @param clubTag - The team club tag
		 */
		public void setClubTag(String clubTag) {
			this.clubTag = clubTag;
		}


		/**
		 * Get the team wins
		 * @return The team wins 
		 */
		public int getTeamWins() {
			return teamWins;
		}


		/**
		 * Set the team wins
		 * @param teamWins - The team wins
		 */
		public void setTeamWins(int teamWins) {
			this.teamWins = teamWins;
		}


		/**
		 * Get the team losses
		 * @return The team losses 
		 */
		public int getTeamLosses() {
			return teamLosses;
		}


		/**
		 * Set the team losses
		 * @param teamWins - The team losses
		 */
		public void setTeamLosses(int teamLosses) {
			this.teamLosses = teamLosses;
		}


		/**
		 * Constructor in charge to make the team using the fields below.
		 * @param _id
		 * @param teamName
		 * @param clubTag
		 * @param teamWins
		 * @param teamLosses
		 */
		public Team(String _id, String ownerID, String teamName, String clubTag, int teamWins, int teamLosses) {
			super();
			this._id = _id;
			this.ownerID = ownerID;
			this.teamName = teamName;
			this.clubTag = clubTag;
			this.teamWins = teamWins;
			this.teamLosses = teamLosses;
		}
		
		

}
