
public class Campagnola implements Pizza {

	private String nome = "Campagnola";
	private double costo = 7.50;
	
	@Override
	public String getNamePizza() {
		
		return nome;
	}

	@Override
	public double costPizza() {
		
		return costo;
	}

}
