package anboqing;

public class ConcreateDecoratorA extends Decorator {
	// 这里用　被包装类的父类引用保存被包装对象　实现多态
	private Component concreate_component ;
	
	public ConcreateDecoratorA(Component cct){
		concreate_component = cct;
	}
	@Override
	public void operation() {
		concreate_component.operation();
		//添加了新的功能（职责)
		System.out.println("ConcreateDecoratorA added operation!");
	}

}
