package tn.iit.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import tn.iit.model.Application;
import tn.iit.model.User;

public class ControllerApplication {
	private Application applicationObj;
	private ArrayList<Application> listeApplications;
	private List<User> listeUser;

	private Gson gson = new Gson();;

	public Application convertJsonObject(String data) {
		applicationObj = new Application();
		gson = new Gson();
		applicationObj = gson.fromJson(data, Application.class);
		return applicationObj;

	}

	public void convertJsonListUseZZr(String data) {
		Type collectionType = new TypeToken<ArrayList<Application>>() {
		}.getType();
		listeUser = gson.fromJson(data, collectionType);
		for (Application application : listeApplications) {
			System.out.println(application.toString());

		}

	}

	public void convertJsonListUser(String data) {

		User[] userListe = gson.fromJson(data, User[].class);

		for (User item : userListe) {
			System.out.println(item.getName());

		}

	}
	public void convert(String data) throws ParseException
	{
		JSONParser parser = new JSONParser();

		Object obj = parser.parse(data);

		JSONObject objjson = (JSONObject) obj;

		JSONArray rxpk = (JSONArray) objjson.get("application");


			JSONObject rxpk2 = (JSONObject) rxpk.get(1);
			String dataString = (String) rxpk2.get("userLogin");
			System.out.println(dataString);
			


		
	}
}
