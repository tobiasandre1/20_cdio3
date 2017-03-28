package dataLayer;

import java.sql.SQLException;
import java.util.List;

import dataLayerInterfaces.DALException;
import dataLayerInterfaces.IOperatoerDAO;
import dataTransferObject.OperatoerDTO;

public class OperatoerDAO implements IOperatoerDAO {

	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		DBConnectorOperatoer con = new DBConnectorOperatoer();
		return con.getOperatoer(oprId);
		
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub

	}
	
	private class DBConnectorOperatoer extends DBConnector{
		public DBConnectorOperatoer(){
			super();
		}
		
		public OperatoerDTO getOperatoer(int opr_id){
			try{
				super.rs = super.st.executeQuery("SELECT * FROM operatoer;");
				System.out.println("Result");
				while(super.rs.next()){
					if(opr_id == super.rs.getInt("opr_id")){ 	//If the opr_id in a row is equal to the given opr_id
						OperatoerDTO opr = new OperatoerDTO(); 	//The create a DTO
						
						//We set the values of the DTO to be equal to this row's values
						opr.setOpr_id(super.rs.getInt("opr_id"));
						opr.setOpr_navn(super.rs.getString("opr_navn"));
						opr.setCpr(super.rs.getString("cpr"));
						opr.setIni(super.rs.getString("ini"));
						opr.setPassword(super.rs.getString("password"));
						return opr;
					}
				}
				return null; //If no element exists with the given opr_id, then return null	
			}catch(SQLException e){
				System.out.println("executeQueryError: "+e);
				e.printStackTrace();
			}catch(Exception e){
				System.out.println("executeQueryError: "+e);
				System.out.println("Well... Something very weird has happened if you see this message...");
			}
			return null;
			
		}
		
	}

}
