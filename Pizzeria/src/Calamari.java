
public class Calamari implements Pizza{
	
	private String nome = "Calamari";
	private double costo = 8.00;
	
	@Override
	public String getNamePizza() {
		
		return nome;
	}

	@Override
	public double costPizza() {
		
		return costo;
	}

}
