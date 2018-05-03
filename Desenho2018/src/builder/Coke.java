package builder;

public class Coke extends ColdDrink{
	
	@Override
	public float price() {
		return 4.00f;
	}
	
	@Override
	public String name() {
		return "Coca-Cola";
	}

}
