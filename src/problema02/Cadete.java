package problema02;

import java.util.ArrayList;

public class Cadete {
	
	private String nombre;
	private Integer dni;
	ArrayList<Comisionable> pedidos;
	
	public Cadete() {
		this.pedidos = new ArrayList<Comisionable>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public void agregarPedido(Pedido p) {
		this.pedidos.add(p);
	}
	
	public void agregarTramite(Tramite t) {
		this.pedidos.add(t);
	}
	
	public Double comisiones() {
		Double total=0d;
		for(Comisionable x: this.pedidos) {
			if(x.getFechaEntrega() != null) {
				total+=x.comision();
			}
		}
		return total;
	}
	
}
