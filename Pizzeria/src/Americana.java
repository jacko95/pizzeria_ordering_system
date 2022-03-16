
public class Americana implements Pizza{

	private String nome = "Americana";
	private double costo = 7.00;
	
	@Override
	public String getNamePizza() {
		
		return nome;
	}

	@Override
	public double costPizza() {
		
		return costo;
	}

}
