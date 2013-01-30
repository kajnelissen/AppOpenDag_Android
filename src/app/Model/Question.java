package app.Model;

import java.util.ArrayList;

/**
 * Question
 *
 * description
 */
public class Question {
	
	/**
	 * Uniek ID van vraag. Komt overeen met ID van
	 * vraag in database.
	 */
	private Integer _id;

	/**
	 * Tekstuele weergave van vraag.
	 */
	private String _text;

	/**
	 * Lijst van antwoorden die bij deze vraag horen.
	 */
	private ArrayList<Answer> _answers;

	/**
	 * Instantieert nieuw Question object zonder antwoorden.
	 */
	public Question()
	{
		this._answers = new ArrayList<Answer>();
	}

    /**
     * Instantieert nieuw Question object met meegegeven
     * ID en tekst, maar zonder antwoorden.
     *
     * @param id    ID van vraag
     * @param text  Vraagtekst
     */
	public Question(Integer id, String text)
	{
		this.setId(id);
		this.setText(text);
		this._answers = new ArrayList<Answer>();
	}

	/**
     * Instantieert nieuw Question object met meegegeven
     * ID, tekst en antwoorden.
     *
     * @param id    ID van vraag
     * @param text  Vraagtekst
     * @param ans   Lijst van antwoorden
     */
	public Question(Integer id, String text, ArrayList ans)
	{
		this.setId(id);
		this.setText(text);
		this._answers = ans;
	}

	/**
	 * GETTERS and SETTERS
	 */
	public void setId(Integer id)
	{
		this._id = id;
	}

	public Integer getId()
	{
		return this._id;
	}

	public void setText(String text)
	{
		this._text = text;
	}

	public String getText()
	{
		return this._text;
	}

	public void addAnswer(Answer ans)
	{
		this._answers.add(ans);
	}

	public ArrayList<Answer> getAnswers()
	{
		return this._answers;
	}

}