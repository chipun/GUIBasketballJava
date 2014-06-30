package com.basketball.player;

/**
 * 
 */

/**
 * @author 559463
 *
 */
class CareerStats {
	
	int points;
	int rebounds;
	int steals;
	int numberOfgames;
	/**
	 * @param points
	 * @param rebounds
	 * @param steals
	 * @param numberOfgames
	 */
	CareerStats(int points, int rebounds, int steals, int numberOfgames) {
		super();
		this.points = points;
		this.rebounds = rebounds;
		this.steals = steals;
		this.numberOfgames = numberOfgames;
	}
	
	double AvgPoints()
	{
		return points / numberOfgames;
	}
	
	double AvgRebounds()
	{
		return rebounds / numberOfgames;
	}
	
	double AvgSteals()
	{
		return steals / numberOfgames;
	}
	
	

}
