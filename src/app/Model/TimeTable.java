package app.Model;

import java.util.ArrayList;

/**
 * Dagprogramma
 *
 * Representatie van dagprogramma voor
 * open dagen.
 */
public class TimeTable {
	
	/**
	 * Verzameling van entries in het dagprogramma.
	 */
	private ArrayList<TimeTableEntry> _entries;

	/**
	 * 
	 */
	public TimeTable()
	{
		this._entries = new ArrayList<TimeTableEntry>();
	}

}