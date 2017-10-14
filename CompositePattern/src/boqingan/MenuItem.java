package boqingan;

import java.util.Iterator;

// 这是组合模式(Composite pattern 中的 leaf)
public class MenuItem extends MenuComponent{
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	public double getPrice() {
		return price;
	}
	
	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

    public void print(){
        System.out.print(" "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", "+getPrice());
        System.out.println("     ----"+getDescription());
    }
    public Iterator createIterator(){
    	return new NullIterator();
    }
}
