package main;

import presentationLayer.*;
import functionalityLayer.*;
import dataLayer.*;
import dataTransferObject.*;


public class Main {

	public static void main(String[] args) {
		DBConnector dbcon = new DBConnector();
		dbcon.getData();
	}

}
