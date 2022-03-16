
public class FruttiDiMare implements Pizza {

	private String nome = "Frutti di mare";
	private double costo = 9.00;
	
	@Override
	public String getNamePizza() {
		
		return nome;
	}

	@Override
	public double costPizza() {
		
		return costo;
	}

}
