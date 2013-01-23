package app.Gate;

use app.Model;

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
	public static IGate Connect();

	/**
	 * Retourneert studiewijzer.
	 */
	public Survey GetSurvey();

	/**
	 * Retourneert de gevraagde studie.
	 */
	public Study GetStudy(String name);

	/**
	 * Retourneert het dagprogramma van de komende
	 * open dag.
	 */
	public TimeTable GetTimeTable();

	/**
	 * Retourneert navigatieroute die gehanteerd
	 * wordt op open dagen van faculteit ICT.
	 */
	public NavigationRoute GetNavigation();

}