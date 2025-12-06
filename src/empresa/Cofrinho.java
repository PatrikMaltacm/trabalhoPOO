package empresa;

import java.util.ArrayList;


public class Cofrinho {
	ArrayList<Moeda> listaMoeda = new ArrayList<>();
	
	public double saldoPorMoeda(Class<? extends Moeda> tipoMoeda) {
		double total = 0;
		
		for (int i = 0; i < listaMoeda.size(); i++) {
		    Moeda m = listaMoeda.get(i);
		    total += m.valor;
		};
		
		return total;
	}


	public void adicionar(Moeda moeda) {

	    for (int i = 0; i < listaMoeda.size(); i++) {
	        Moeda m = listaMoeda.get(i);

	        // Verifica se é o mesmo tipo da moeda informada
	        if (m.getClass() == moeda.getClass()) {

	            // Soma o valor
	            m.valor += moeda.valor;

	            return; // pronto, adicionou
	        }
	    }

	    // Se não achou nenhuma do mesmo tipo, adiciona nova
	    listaMoeda.add(moeda);
	}

	
	public void remover(Moeda moeda) {

	    for (int i = 0; i < listaMoeda.size(); i++) {

	        Moeda m = listaMoeda.get(i);

	        // Verifica se é o mesmo tipo da moeda informada
	        if (m.getClass() == moeda.getClass()) {

	            // Se a moeda dentro do cofre tem valor suficiente
	            if (m.valor >= moeda.valor) {

	                m.valor -= moeda.valor;  // subtrai o valor solicitado

	                // Se o valor ficar zero, remove o objeto da lista
	                if (m.valor == 0) {
	                    listaMoeda.remove(i);
	                }

	                return;
	            }
	        }
	    }

	    System.out.println("Não foi possível remover: valor insuficiente ou moeda inexistente.");
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
