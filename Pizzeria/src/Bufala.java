
public class Bufala implements Pizza{

	private String nome = "Bufala";
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
