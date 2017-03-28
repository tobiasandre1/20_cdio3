package dataTransferObject;

public class RaavareDTO {
	private int raavare_id;
	private String raavare_navn;
	private String leverandoer;
	
	public RaavareDTO(int raavare_id, String raavare_navn, String leverandoer){
		this.raavare_id = raavare_id;
		this.raavare_navn = raavare_navn;
		this.leverandoer = leverandoer;
	}
	
	public int getRaavare_id() {
		return raavare_id;
	}
	public void setRaavare_id(int raavare_id) {
		this.raavare_id = raavare_id;
	}
	public String getRaavare_navn() {
		return raavare_navn;
	}
	public void setRaavare_navn(String raavare_navn) {
		this.raavare_navn = raavare_navn;
	}
	public String getLeverandoer() {
		return leverandoer;
	}
	public void setLeverandoer(String leverandoer) {
		this.leverandoer = leverandoer;
	}
	
	
}
