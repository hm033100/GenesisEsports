package com.gcu.genesisesports.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.genesisesports.Data.TeamDataService;
import com.gcu.genesisesports.Model.Team;

@Service
public class TeamService {
	
		//teamRepo - Team Data Service, DAO that will provide the methods to connect to MongoDB
		@Autowired
		private TeamDataService teamRepo;
		
		/**
		 * Team Service Constructor to inject the DAO
		 * @param teamRepo - TeamDataService: Data Access Object
		 */
		public TeamService(TeamDataService teamRepo) {
			this.teamRepo = teamRepo;
		}
		
		
		/**
		 * findAll will make a request to the data service and will grab all the teams from the DB
		 * @return List - List of all teams
		 */
		public List<Team> findAll() {
			return teamRepo.findAll();
		}
		
		/**
		 * findById will take a unique ID and return a list of teams that have that ID
		 * @param id - String: The ID of a team that is generated
		 * @return teams - Optional<Team>: A list of teams that comes from the database
		 */
		public Optional<Team> findById(String id) {
			return teamRepo.findById(id);
		}
		
		/**
		 * save - This method is considered to be the insert/create/update because thats how MongoDB will operate.
		 * @param team - The team object.
		 * @return Team - Team Object
		 */
		public Team save(Team team) {
			return teamRepo.save(team);
		}
		
		/**
		 * deleteById - This method will delete a Team from the database given the unique ID
		 * @param Id - The ID of the Team
		 */
		public void deleteById(String Id){
			teamRepo.deleteById(Id);
		}

}
