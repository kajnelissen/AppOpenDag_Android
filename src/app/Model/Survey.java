package app.Model;

import java.util.ArrayList;

/**
 * survey
 *
 * Representeert een studiewijzer in de applicatie. Een studiewijzer bestaat
 * uit een verzameling vragen met daaraan gekoppeld een aantal antwoorden.
 * Elk antwoord heeft een bepaalde score waarmee een studieadvies kan worden
 * gegeven.
 *
 * @author Kaj Nelissen
 * @version 1.0
 * @since 0.2
 */
public class Survey {

    /**
     * Lijst van vragen die deze survey bevat.
     */
	private ArrayList<Question> _questions;
	
	/**
	 * Instantieert een lege survey.
	 */
	public Survey()
	{
        this._questions = new ArrayList<Question>();
	}

    /**
     * Retourneert alle vragen van de survey instance.
     *
     * @return Vragen in survey
     */
    public ArrayList<Question> getQuestions()
    {
        return this._questions;
    }

    /**
     * Voegt meegegeven vraag toe aan deze survey.
     *
     * @param q Vraag om toe te voegen aan survey
     */
    public void addQuestion(Question q)
    {
        this._questions.add(q);
    }

}