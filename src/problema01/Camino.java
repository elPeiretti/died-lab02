package problema01;

import java.util.ArrayList;
import java.util.List;

public class Camino {
	ArrayList<Coordenada> listaCoordenadas;
	
	public Camino() {
		listaCoordenadas = new ArrayList<Coordenada>();
	}
	
	public void agregar(Coordenada x) {
		listaCoordenadas.add(x);
	}
	public void agregar(Double lat, Double lon) {
		this.agregar(new Coordenada(lat,lon));
	}
	
	public void agregar(Integer mtsLt, Integer mtsLn) {
		if(listaCoordenadas.isEmpty()) {
			listaCoordenadas.add(new Coordenada(mtsLt,mtsLn));
		}
		else {
			Coordenada ult=listaCoordenadas.get(listaCoordenadas.size()-1);
			listaCoordenadas.add(new Coordenada(ult,mtsLt,mtsLn));
		}
		
	}
	
	public List<Coordenada> buscar(Coordenada no, Coordenada se){
		List<Coordenada> ans = new ArrayList<Coordenada>();
		
		for(Coordenada cord: listaCoordenadas){
			if(cord.inRange(se, no)) {
				ans.add(cord);
			}
		}
		return ans;
	}
	
	public List<Coordenada> buscar(Coordenada centro, Integer radio){
		
		Coordenada no= new Coordenada(centro,radio,-radio);
		Coordenada se= new Coordenada(centro,-radio,radio);
	
		
		return this.buscar(no,se);
	}
	
}
