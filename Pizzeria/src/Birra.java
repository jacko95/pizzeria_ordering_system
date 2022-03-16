
public class Birra implements Bevanda {
	
	private String nome = "Birra 66cl";
	private double costo = 5.00;
	
	@Override
	public String getNameBevanda() {
		
		return nome;
	}

	@Override
	public double costBevanda() {
		
		return costo;
	}

}
