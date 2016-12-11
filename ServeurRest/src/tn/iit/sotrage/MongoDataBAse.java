package tn.iit.sotrage;

import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;

public class MongoDataBAse {
	DBCollection collection;

	public MongoDataBAse(String Coll) {
		DB db;
		try {
			Mongo mongo = new Mongo("localhost", 27017);
			db = mongo.getDB("rest");
			collection = db.getCollection(Coll);

		} catch (UnknownHostException ex) {
			JOptionPane.showMessageDialog(null, "Veuillez vérifier votre connexion à la base de donnée");
		}

	}

	public void insererTrame(String trame) {
		DBObject dBObject = (DBObject) JSON.parse(trame);
		collection.insert(dBObject);

	}

	public void getUser() {
		System.out.println(collection.findOne());

	}

	public void Supprimer() {
		collection.drop();

	}
	public static void main(String args[]){
		MongoDataBAse mongoDataBAse=new MongoDataBAse("user");
		mongoDataBAse.getUser();
		
	}

}