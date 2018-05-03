package builder;

public class Pepsi extends ColdDrink{
	
	@Override
	public float price() {
		return 3.50f;
	}
	
	@Override
	public String name() {
		return "Pepsi";
	}

}
