package dataTransferObject;

public class RaavareBatch {
	private int rb_id;
	private int raavare_id;
	private int maengde;
	
	public RaavareBatch(int rb_id, int raavare_id, int maengde) {
		this.rb_id = rb_id;
		this.raavare_id = raavare_id;
		this.maengde = maengde;
	}

	public int getRb_id() {
		return rb_id;
	}

	public void setRb_id(int rb_id) {
		this.rb_id = rb_id;
	}

	public int getRaavare_id() {
		return raavare_id;
	}

	public void setRaavare_id(int raavare_id) {
		this.raavare_id = raavare_id;
	}

	public int getMaengde() {
		return maengde;
	}

	public void setMaengde(int maengde) {
		if(maengde > 0){
			this.maengde = maengde;
		}
		else{
			this.maengde = 0;
		}
	}
	
	
	
}
