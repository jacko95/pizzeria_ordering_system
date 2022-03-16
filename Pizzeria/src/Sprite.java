
public class Sprite implements Bevanda {
	
	private String nome = "Sprite";
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
