package dataTransferObject;

public class OperatoerDTO {
	private int opr_id;
	private String opr_navn;
	private String ini;
	private String cpr;
	private String password;
	
	public OperatoerDTO(int opr_id, String opr_navn, String ini, String cpr, String password){
		this.opr_id = opr_id;
		this.opr_navn = opr_navn;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password;
	}
	
	public OperatoerDTO(){
		//This is for creating the object but assigning the values later
	}
	
	public int getOpr_id() {
		return opr_id;
	}
	public void setOpr_id(int opr_id) {
		this.opr_id = opr_id;
	}
	public String getOpr_navn() {
		return opr_navn;
	}
	public void setOpr_navn(String opr_navn) {
		this.opr_navn = opr_navn;
	}
	public String getIni() {
		return ini;
	}
	public void setIni(String ini) {
		this.ini = ini;
	}
	public String getCpr() {
		return cpr;
	}
	public void setCpr(String cpr) {
		this.cpr = cpr;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Operatoer [ID=" + opr_id + ", Name=" + opr_navn + ", Initials=" + ini + "]"; //We don't print the CPR or the password
	}
	
}
