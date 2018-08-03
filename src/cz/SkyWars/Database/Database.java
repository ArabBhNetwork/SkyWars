package cz.SkyWars.Database;

public interface Database {
	
	/*
	 * This is stats
	 */
	
	boolean checkAccStats(String username);

	int getKills(String username);

	void addKills(String username, int kills);

	int getWins(String username);

	void addWins(String username, int wins);

	int getDeaths(String username);

	void addDeaths(String username, int kills);

  	void createDataStats(String username);
  	
 
  	
}
