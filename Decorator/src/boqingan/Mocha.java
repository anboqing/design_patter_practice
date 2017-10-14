package boqingan;

/**
 * @author anboqing__
 *	摩卡是一个装饰者,所以让它继承CondimentDecorator
 */
public class Mocha extends CondimentDecorator {
	/*
	 * 要让mocha 能够引用一个Beverage,做法如下:
	 * 1.用一个被装饰者的实例变量记录饮料
	 * 2.想办法让被装饰者记录到实例变量中(这里是作为构造函数的参数)
	 * */
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		/**
		 * 我们希望description不只是描述饮料本身("eg..DarkRoast")
		 * 而是希望完整的调料都描述出来("DarkRoast,Mocha")
		 * 所以首先用委托的做法,得到一个description,然后再在其后加上附加的叙述例如＂Mocha"
		 */
		return beverage.getDescription()//这是委托
				+",Mocha";
	}

	@Override
	public double cost() {
		/*
		 * 要计算带Mocha饮料的价钱，首先把调用  委托  给被装饰对象，
		 * 以计算价钱，然后再加上Mocha的价钱
		 * 得到最后的结果
		 */
		return beverage.cost()//这是委托
				+0.20;
	}
}
