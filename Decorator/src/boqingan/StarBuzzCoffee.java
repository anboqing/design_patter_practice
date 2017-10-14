package boqingan;

public class StarBuzzCoffee {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 订一杯Espresso(浓缩咖啡)不要调料，打印描述与价格
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $"+beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		//用Mocha 装饰它
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $"+beverage3.cost());
	}
}
