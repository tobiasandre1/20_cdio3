package dataTransferObject;

public class ReceptKomponentDTO {
	private int recept_id;
	private int raavare_id;
	private int nom_netto;
	private int tolerance;
	
	public ReceptKomponentDTO(int recept_id, int raavare_id, int nom_netto, int tolerance) {
		this.recept_id = recept_id;
		this.raavare_id = raavare_id;
		this.nom_netto = nom_netto;
		this.tolerance = tolerance;
	}

	public int getRecept_id() {
		return recept_id;
	}

	public void setRecept_id(int recept_id) {
		this.recept_id = recept_id;
	}

	public int getRaavare_id() {
		return raavare_id;
	}

	public void setRaavare_id(int raavare_id) {
		this.raavare_id = raavare_id;
	}

	public int getNom_netto() {
		return nom_netto;
	}

	public void setNom_netto(int nom_netto) {
		if(nom_netto > 0){
			this.nom_netto = nom_netto;
		}
		else{
			this.nom_netto = 0;
		}
	}

	public int getTolerance() {
		return tolerance;
	}

	public void setTolerance(int tolerance) {
		if(tolerance > 0){
			this.tolerance = tolerance;
		}
		else{
			this.tolerance = 0;
		}
	}
	
	
	
}
