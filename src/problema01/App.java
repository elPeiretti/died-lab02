package problema01;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Coordenada c1 = new Coordenada(3.0,3.0);
		Coordenada c2 = new Coordenada(3.0,4.0);
		Coordenada c3 = new Coordenada(6.0,4.0);
		
		Camino cam1 = new Camino();
		
		cam1.agregar(c1);
		cam1.agregar(c2);
		cam1.agregar(1,1);
		cam1.agregar(c3);
		
		List<Coordenada> vecinos= cam1.buscar(c2, 10);
		
		for(Coordenada cord: vecinos) {
			System.out.println("POS: "+cord.getLatitud()+" "+cord.getLongitud());
		}
	}

}
