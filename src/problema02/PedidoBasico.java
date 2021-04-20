package problema02;

import java.util.ArrayList;

public class PedidoBasico extends Pedido {

	private boolean express;
	
	public PedidoBasico() {
		this.cantMax=5;
		this.express=false;
		this.cantProductos=0;
		this.Productos=new ArrayList<Producto>();
		this.concretado=false;
	}
	
	public void setExpress(boolean b) {
		this.express=b;
	}

	public boolean isExpress() {
		return express;
	}

	@Override
	public Double precio() {
		Double total=0d;
		for(Producto p: this.Productos) {
			total+=p.getPrecio() + p.getPrecio()*0.05;
		}
		
		if(this.express) {
			return total+total*0.2;
		}
		else {
			return total;
		}
	}

	@Override
	public Double comision() {
		return this.precio()*0.15;
	}

	
}
