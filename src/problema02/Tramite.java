package problema02;

import java.time.LocalDate;

public class Tramite implements Comisionable{

	private String tipo;
	private Double precio;
	private LocalDate fechaEntrega;
	
	@Override
	public Double comision() {
		return 20d;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	
}
