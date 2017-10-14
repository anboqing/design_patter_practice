package boqingan;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription() {
		//return beverage.description+",Whip";
		return beverage.getDescription()+",Whip";
	}

	public double cost() {
		return beverage.cost()+1.29;
	}

}
