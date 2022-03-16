
public class CocaCola implements Bevanda {

	private String nome = "Coca Cola";
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
