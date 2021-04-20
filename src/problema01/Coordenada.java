package problema01;

public class Coordenada {
	Double latitud;
	Double longitud;
	
	public Coordenada() {}
	public Coordenada(Double lat, Double lon) {
		this.latitud=lat;
		this.longitud=lon;
	}
	
	public Coordenada(Integer mtsLt,Integer mtsLn) {
		this.longitud = ((double) mtsLt)*(1f/111.32)/1000f;
		this.latitud = ((double) mtsLn)*(1f/111.32)/1000f;
	}
	
	public Coordenada(Coordenada prev, Integer mtsLt,Integer mtsLn) {
		Double lat= ((double) mtsLt)*(1f/111.32)/1000f;
		Double lon= ((double) mtsLn)*(1f/111.32)/1000f;
		
		this.latitud= lat+prev.getLatitud();
		this.longitud= lon+prev.getLongitud();
	}
	public boolean equals(Coordenada c2) {
		return (latitud==c2.getLatitud() && longitud==c2.getLongitud());
	}
	
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	

	public Boolean inRange(Coordenada se, Coordenada no) {
		if(this.latitud <= no.getLatitud() && this.latitud >= se.getLatitud()) {
			return (this.longitud<=se.getLongitud() && this.longitud >= no.getLongitud());
		}
		return false;
	}
	
	
	
	
	
	
}
