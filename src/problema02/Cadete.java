package problema02;

import java.util.ArrayList;

public class Cadete {
	
	private String nombre;
	private Integer dni;
	ArrayList<Pedido> pedidos;
	
	public Cadete() {
		this.pedidos = new ArrayList<Pedido>();
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
	
	public Double comisiones() {
		Double total=0d;
		for(Pedido p: pedidos) {
			if(!p.isConcretado()) {
				total+=p.comision();
			}
		}
		return total;
	}
	
}
