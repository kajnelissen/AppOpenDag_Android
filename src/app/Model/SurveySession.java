package app.Model;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * short
 *
 * description
 */
public class SurveySession {
	
	/**
	 * Verzameling scores van gegeven antwoorden.
	 */
	private ArrayList<Answer> _givenAnswers;

	/**
	 * Instantieert nieuwe sessie.
	 */
	public SurveySession()
	{
		this._givenAnswers = new ArrayList<Answer>();
	}

	/**
	 * Retourneert een nieuwe sessie voor de
	 * studeerwijzer.
	 *
	 * @return SurveySession Nieuwe sessie
	 */
	public static SurveySession Create()
	{
		return new SurveySession();
	}

	/**
	 * Voegt meegegeven antwoord toe aan de
	 * verzameling van gegeven antwoorden.
	 */
	public void addAnswers(Answer ans)
	{
		this._givenAnswers.add(ans);
	}

}