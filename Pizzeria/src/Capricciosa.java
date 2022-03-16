
public class Capricciosa implements Pizza{

	private String nome = "Capricciosa";
	private double costo = 6.50;
	
	@Override
	public String getNamePizza() {
		
		return nome;
	}

	@Override
	public double costPizza() {
		
		return costo;
	}

}
