package tn.iit.rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReciveData {

	public static String getData() {

		StringBuffer response = new StringBuffer();
		String inputLine;
		BufferedReader in;
		try {

			URL obj = new URL("http://soitech.cloudapp.net/application");

			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();

			if (responseCode == 404) {

				response.append("404");
			} else if (responseCode == 200) {

				in = new BufferedReader(new InputStreamReader(con.getInputStream()));

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return response.toString();

	}
	public static String getUsers() {

		StringBuffer response = new StringBuffer();
		String inputLine;
		BufferedReader in;
		try {

			URL obj = new URL("http://soitech.cloudapp.net/user");

			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();

			if (responseCode == 404) {

				response.append("404");
			} else if (responseCode == 200) {

				in = new BufferedReader(new InputStreamReader(con.getInputStream()));

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return response.toString();

	}
}