package empresa;

import java.util.ArrayList;


public class Cofrinho {
	ArrayList<Moeda> listaMoeda;
	
	public void adicionar(Moeda moeda) {
		listaMoeda.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		listaMoeda.add(moeda);
	}
	
	public void listarMoedas() {
		for (int i = 0; i < listaMoeda.size(); i++) {
		    Moeda m = listaMoeda.get(i);
		    m.info();
		};
	}

	public double totalConvertido() {
		double total = 0;
		for (int i = 0; i < listaMoeda.size(); i++) {
			Moeda m = listaMoeda.get(i);
			total += m.converter();
		}
		return total;
	}
}
