package dataLayer;

import java.sql.DriverManager;

public class DBConnector {
	
	/* 
	 * HOW TO USE:
	 * DBConnector dbcon = new DBConnector();
	 * dbcon.getData();
	 */

	private java.sql.Connection con;
	private java.sql.Statement st;
	private java.sql.ResultSet rs;
	
	public DBConnector(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/20_weightdb", "root", "");
			st = con.createStatement();
		
		}catch(Exception e){
			System.out.println("DBConnectError: "+e);
		}
		
	}
	
	public void getData(){
		try{
			String query = "SELECT * FROM operatoer;";
			rs = st.executeQuery(query);
			System.out.println("Result");
			while(rs.next()){
				String exampleData = rs.getString("opr_id");
				System.out.println(exampleData);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("getDataError: "+e);
		}
	}
	
}
