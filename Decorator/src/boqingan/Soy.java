package boqingan;

public class Soy extends CondimentDecorator {

	private Beverage beverage;
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	public double cost() {
		return beverage.cost()+1.9;
	}

	public String getDescription() {
		return beverage.description+",Soy";
	}

}
