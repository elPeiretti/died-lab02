package problema02;

import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Pedido implements Comisionable{
	protected ArrayList<Producto> Productos;
	protected Integer cantProductos;
	protected Integer cantMax;
	protected boolean concretado;
	protected LocalDate fechaEntrega;
	
	public abstract Double precio();
	
	
	public boolean isConcretado() {
		return concretado;
	}
	
	public LocalDate getFechaEntrega() {
		return this.fechaEntrega;
	}
	
	public boolean agregarProducto(Producto p) {
		if(this.cantMax>this.cantProductos) {
			this.cantProductos++;
			this.Productos.add(p);
			return true;
		}
		else {
			return false;
		}
	}
	
}
