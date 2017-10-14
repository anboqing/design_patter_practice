package anboqing;

public class ConcreateDecoratorB extends Decorator {
	private Component component;
	
	public ConcreateDecoratorB(Component component){
		this.component = component;
	}
	
	public void operation() {
		component.operation();
		System.out.println("Concreate decorator B added operation ! ");
	}

}
