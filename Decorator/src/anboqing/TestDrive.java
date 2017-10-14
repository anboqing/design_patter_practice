package anboqing;

public class TestDrive {
	public static void main(String[] args) {
		Component cc1 = new ConcreateComponent();
		cc1.operation();
		
		System.out.println("----------");
		
		Component cc2 = new ConcreateComponent();
		cc2 = new ConcreateDecoratorA(cc2);
		cc2 = new ConcreateDecoratorB(cc2);
		cc2.operation();
	}
}
