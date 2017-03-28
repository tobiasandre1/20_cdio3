package dataTransferObject;

public class ProduktBatchKomponentDTO {
	
	private int pb_id;
	private int status;
	private int tara;
	private int netto;
	private int opr_id;
	
	public ProduktBatchKomponentDTO(int pb_id, int status, int tara, int netto, int opr_id) {
		this.pb_id = pb_id;
		this.status = status;
		this.tara = tara;
		this.netto = netto;
		this.opr_id = opr_id;
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

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	public int getNetto() {
		return netto;
	}

	public void setNetto(int netto) {
		this.netto = netto;
	}

	public int getOpr_id() {
		return opr_id;
	}

	public void setOpr_id(int opr_id) {
		this.opr_id = opr_id;
	}
	
	
	
}
