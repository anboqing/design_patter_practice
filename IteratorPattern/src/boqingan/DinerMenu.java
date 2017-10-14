package boqingan;

import java.util.Iterator;

public class DinerMenu implements Menu{
	private static final int MAX_LEN = 6;
	private int numberOfItems = 0;
	MenuItem[] menuItems;
	public DinerMenu(){
		menuItems = new MenuItem[MAX_LEN];
		addItem("Diner","diner",false,20.88);
	}
	public void addItem(String name,String des,boolean veg,double price){
		MenuItem item = new MenuItem(name,des,veg,price);
		if(numberOfItems >= MAX_LEN){
			System.err.print("Sorry ");
		}else{
			menuItems[numberOfItems++] = item;
		}
	}
	@Override
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
