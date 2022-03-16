
public class Fanta implements Bevanda {
	
	private String nome = "Fanta";
	private double costo = 3.50;
	
	@Override
	public String getNameBevanda() {
		
		return nome;
	}

	@Override
	public double costBevanda() {
		
		return costo;
	}

}
