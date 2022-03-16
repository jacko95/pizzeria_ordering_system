
public class The implements Bevanda {

	private String nome = "The";
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
