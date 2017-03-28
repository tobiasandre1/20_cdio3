package dataTransferObject;

public class ProduktBatchDTO {

	private int pb_id;
	private int status;
	private int recept_id;
	
	public ProduktBatchDTO(int pb_id, int status, int recept_id) {
		this.pb_id = pb_id;
		this.status = status;
		this.recept_id = recept_id;
	}

	public int getPb_id() {
		return pb_id;
	}

	public void setPb_id(int pb_id) {
		this.pb_id = pb_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRecept_id() {
		return recept_id;
	}

	public void setRecept_id(int recept_id) {
		this.recept_id = recept_id;
	}
	
	
	
	
}
