package empresa;

public class Euro extends Moeda  {
	
	public Euro(double valor) {
		super(valor);
	}
	
	public void info() {
		System.out.println("Valor em Euro: " + valor);
	}
	
	public double converter() {
		return valor * 6.33;
	}
}
