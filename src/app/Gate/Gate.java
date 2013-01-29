package app.Gate;

import app.Model.*;
//import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.HttpResponse;
import android.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Gate
 *
 * Standaardimplementatie van IGate die gebruik maakt 
 * van HTTP-requests om te communiceren met de back-end API.
 */
public class Gate implements IGate {

	private static String URL_STUDY = "";
	private static String URL_SURVEY = "";
	private static String URL_TIMETABLE = "";
	private static String URL_NAVIGATION = "";
	
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
	public Gate connect()
	{
		Gate gate = new Gate();

		return gate;
	}

	/**
	 * Retourneert studiewijzer.
	 */
	public Survey getSurvey() 
	{
        return new Survey();
	}

	/**
	 * Retourneert de gevraagde studie.
	 */
	public Study getStudy(String name)
	{
        return null;
	}

	/**
	 * Retourneert het dagprogramma van de komende open dag.
	 */
	public TimeTable getTimeTable()
	{
        return new TimeTable();
	}

	/**
	 * Retourneert navigatieroute die gehanteerd wordt op 
	 * open dagen van faculteit ICT.
	 */
	public NavigationRoute getNavigation()
	{
        return new NavigationRoute();
	}

	/**
	 * 
	 */
	private String callWebErvice(String serviceURL)
	{
		// http get client
    	HttpClient client = new DefaultHttpClient();
    	HttpGet getRequest = new HttpGet();

    	try
    	{
    		// construct a URI object
			getRequest.setURI(new URI(serviceURL));
		}
		catch (URISyntaxException e)
		{
			Log.e("URISyntaxException", e.toString());
		}

		// buffer reader to read the response
    	BufferedReader in = null;
    	// the service response
    	HttpResponse response = null;

		try
		{
			// execute the request
			response = client.execute(getRequest);
		}
		catch (ClientProtocolException e)
		{
			Log.e("ClientProtocolException", e.toString());
		}
		catch (IOException e)
		{
			Log.e("IO exception", e.toString());
		}

    	try
    	{
			in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		}
		catch (IllegalStateException e)
		{
			Log.e("IllegalStateException", e.toString());
		}
		catch (IOException e)
		{
			Log.e("IO exception", e.toString());
		}

    	StringBuffer buff = new StringBuffer("");
    	String line = "";

    	try
    	{
			while( (line = in.readLine()) != null )
			{
				buff.append(line);
			}
		}
		catch (IOException e)
		{
			Log.e("IO exception", e.toString());
			return e.getMessage();
		}

    	try
    	{
			in.close();
		}
		catch (IOException e)
		{
			Log.e("IO exception", e.toString());
		}

    	// response, need to be parsed
    	return buff.toString();
	}

}