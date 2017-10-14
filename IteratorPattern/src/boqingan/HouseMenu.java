package boqingan;

import java.util.Iterator;
import java.util.ArrayList;

public class HouseMenu implements Menu {
	
	private ArrayList<MenuItem> menuItems;
	
	private void addItem(String name,String description,boolean vegetarian,double price){
		MenuItem item = new MenuItem(name,description,vegetarian,price);
		menuItems.add(item);
	}
	
	public HouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		addItem("豆腐","豆制品",true,1.00);
		addItem("cafee","cafe ",true,2.00);
	}
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return menuItems.iterator();
	}

}
