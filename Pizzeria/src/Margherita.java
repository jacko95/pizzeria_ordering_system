
public class Margherita implements Pizza {

	private String nome = "Margherita";
	private double costo = 4.50;
	
	@Override
	public String getNamePizza() {
		
		return nome;
	}

	@Override
	public double costPizza() {
		
		return costo;
	}

}