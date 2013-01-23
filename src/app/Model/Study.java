package app.Model;

/**
 * Studie
 *
 * Klasse die een studie representeert.
 */
public class Study {

	/**
	 * Naam van studie.
	 */
	private String _name;

	/**
	 * Informatie over studie.
	 * Noot: opgemaakt in BB Code.
	 */
	private String _info;
	
	/**
	 * Instantieert een nieuw Study object met
	 * de meegegeven naam en informatie.
	 */
	public Study(String name, String info)
	{
		this._name = name;
		this._info = info;
	}

	/**
	 * Retourneert de studie-informatie van deze
	 * studie in HTML-opmaak.
	 */
	public String GetParserInfo()
	{
		// return bb code parsed study info
		return "";
	}

}