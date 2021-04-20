package problema02;

import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Pedido {
	protected ArrayList<Producto> Productos;
	protected Integer cantProductos;
	protected Integer cantMax;
	protected boolean concretado;
	protected LocalDate fechaEntrega;
	
	public abstract Double precio();
	public abstract Double comision();
	
	public boolean isConcretado() {
		return concretado;
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
