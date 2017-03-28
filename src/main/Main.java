package main;

import dataLayer.*;


public class Main {

	public static void main(String[] args) {
		DBConnector dbcon = new DBConnector();
		dbcon.getData("SELECT * FROM operatoer;");
	}

}
