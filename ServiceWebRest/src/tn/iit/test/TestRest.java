package tn.iit.test;

import org.json.simple.parser.ParseException;

import tn.iit.controller.ControllerApplication;
import tn.iit.rest.ReciveData;

public class TestRest {

	public static void main(String[] args) throws ParseException {
		ControllerApplication controllerApplication = new ControllerApplication();
		String applicaionString=ReciveData.getData();
		String userString = ReciveData.getUsers();
		controllerApplication.convert(applicaionString);
		//controllerApplication.convertJsonListUser(userString);

	}

}
