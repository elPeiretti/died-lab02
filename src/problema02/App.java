package problema02;

import java.time.LocalDate;

public class App {

	public static void main(String args[]) {
		Cadete c1 = new Cadete();
		Pedido p1 = new PedidoBasico();
		PedidoPremium p2 = new PedidoPremium();
		Producto prod1 = new Producto(130.0);
		Producto prod2 = new Producto(100.0);
		
		p1.agregarProducto(prod1);
		c1.agregarPedido(p1);
		
		System.out.println(p1.precio());
		System.out.println(c1.comisiones());
		p2.agregarProducto(prod1);
		System.out.println(p2.precio());
		
		p1.agregarProducto(prod2);
		System.out.println(c1.comisiones());
		c1.agregarPedido(p2);
		System.out.println(c1.comisiones());
		
		Tramite t1 = new Tramite();
		t1.setPrecio(10d);
		t1.setFechaEntrega(LocalDate.now());
		c1.agregarTramite(t1);
		System.out.println(c1.comisiones()); //solo cuenta el tramite, el resto tiene la fecha en null :)
		
	}
}
