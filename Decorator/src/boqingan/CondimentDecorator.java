package boqingan;
//首先必须让condiment decorator 能够取代 beverage 所以继承beverage
public abstract class CondimentDecorator extends Beverage {
	// 所有的调料装饰者都必须重新实现getDescription()方法
	public abstract String getDescription();
}
