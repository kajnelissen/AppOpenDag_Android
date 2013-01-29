package app.Gate;

import app.Model.*;

/**
 * IGate interface
 *
 * Interface voor communicatie met back-end.
 */
public interface IGate {
	
	/**
	 * Maakt verbinding met API van back-end en 
	 * retourneert verbonden instantie van deze 
	 * interface.
	 */
	public IGate connect();

	/**
	 * Retourneert studiewijzer.
	 */
	public Survey getSurvey();

	/**
	 * Retourneert de gevraagde studie.
	 */
	public Study getStudy(String name);

	/**
	 * Retourneert het dagprogramma van de komende
	 * open dag.
	 */
	public TimeTable getTimeTable();

	/**
	 * Retourneert navigatieroute die gehanteerd
	 * wordt op open dagen van faculteit ICT.
	 */
	public NavigationRoute getNavigation();

}