
public class QuattroStagioni implements Pizza{

	private String nome = "Quattro stagioni";
	private double costo = 6.50;
	
	@Override
	public String getNamePizza() {
		
		return nome;
	}

	@Override
	public double costPizza() {
		
		return costo;
	}
	

}
