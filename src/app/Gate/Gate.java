package app.Gate;

use app.Model;

/**
 * Gate
 *
 * Standaardimplementatie van IGate die gebruik maakt 
 * van HTTP-requests om te communiceren met de back-end API.
 */
public class Gate implements IGate {
	
	/**
	 * Instantieert nieuw Gate object.
	 */
	private Gate()
	{
		// lege constructor
	}

	/**
	 * Verbindt app met het back-end door middel van een 
	 * HTTP-connectie naar de Web API.
	 * 
	 * @return Gate Verbonden instantie van deze klasse.
	 */
	public static Gate Connect()
	{
		return new Gate();
	}

	/**
	 * Retourneert studiewijzer.
	 */
	public Survey GetSurvey() 
	{

	}

	/**
	 * Retourneert de gevraagde studie.
	 */
	public Study GetStudy(String name)
	{

	}

	/**
	 * Retourneert het dagprogramma van de komende open dag.
	 */
	public TimeTable GetTimeTable()
	{

	}

	/**
	 * Retourneert navigatieroute die gehanteerd wordt op 
	 * open dagen van faculteit ICT.
	 */
	public NavigationRoute GetNavigation()
	{

	}

}