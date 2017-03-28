package dataTransferObject;

public class ReceptDTO {
	
	private int recept_id;
	private String recept_navn;
	
	public ReceptDTO(int recept_id, String recept_navn) {
		this.recept_id = recept_id;
		this.recept_navn = recept_navn;
	}

	public int getRecept_id() {
		return recept_id;
	}

	public void setRecept_id(int recept_id) {
		this.recept_id = recept_id;
	}

	public String getRecept_navn() {
		return recept_navn;
	}

	public void setRecept_navn(String recept_navn) {
		this.recept_navn = recept_navn;
	}
	
	
	
	
	
}
