package problema02;

import java.util.ArrayList;

public class PedidoPremium extends Pedido{
		
	public PedidoPremium() {
		this.cantMax=20;
		this.cantProductos=0;
		this.Productos=new ArrayList<Producto>();
		this.concretado=false;
	}

	@Override
	public Double precio() {
		double porcentaje;
		if(this.cantProductos<6) {
			porcentaje=0.20;
		}
		else {
			porcentaje=0.30;
		}
		
		Double total=0d;
		for(Producto p: this.Productos) {
			total+=p.getPrecio() + p.getPrecio()*porcentaje;
		}
		return total;
	}

	@Override
	public Double comision() {
		return this.precio()*0.15;
	}

}	
