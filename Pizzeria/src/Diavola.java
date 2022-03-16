
public class Diavola implements Pizza{

	private String nome = "Diavola";
	private double costo = 6.00;
	
	@Override
	public String getNamePizza() {
		
		return nome;
	}

	@Override
	public double costPizza() {
		
		return costo;
	}

}
