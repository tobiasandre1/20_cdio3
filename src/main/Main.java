package main;

import dataLayer.*;
import dataLayerInterfaces.*;
 

public class Main {

	public static void main(String[] args) throws DALException {
		IOperatoerDAO opr = new OperatoerDAO();
		System.out.println(opr.getOperatoer(3));
	}

}
