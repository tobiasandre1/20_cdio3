package dataLayer;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	/* 
	 * HOW TO USE:
	 * DBConnector dbcon = new DBConnector();
	 * dbcon.executeQuery("SELECT * FROM table;"); / dbcon.getData("SELECT * FROM table;");
	 */

	private java.sql.Connection con;
	private java.sql.Statement st;
	private java.sql.ResultSet rs;
	
	private String DATABASE = "20_weightdb";
	private String HOST = "localhost";
	private int PORT = 3306;
	private String USER = "root";
	private String PASSWORD = "";
	
	public DBConnector(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://" + HOST +":" + PORT + "/" +DATABASE, USER, PASSWORD);
			st = con.createStatement();
		
		}catch(Exception e){
			System.out.println("DBConnectError: "+e);
		}
		
	}
	
	public void executeQuery(String query){
		try{
			System.out.println(query);
			rs = st.executeQuery(query);
			System.out.println("Query successful!");
		}catch(SQLException e){
			System.out.println("executeQueryError: "+e);
			e.printStackTrace();
		}
	}
	
	public void getData(String query){
		try{
			rs = st.executeQuery(query);
			System.out.println("Result");
			while(rs.next()){
				String exampleData = rs.getString("opr_id");
				System.out.println(exampleData + "  " + rs.getString("opr_navn"));
			}
			
		}catch(Exception e){
			System.out.println("getDataError: "+e);
			e.printStackTrace();
		}
	}
	
}
