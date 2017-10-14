package boqingan;
import java.util.*;

public class Waitress {
	//Menu hm;
	//Menu dm;
    ArrayList<Menu> menus;
	public Waitress(ArrayList<Menu> menus) {
		super();
        this.menus = menus;
	}
	public void printMenu(){
		//printMenu(hm.createIterator());
		//printMenu(dm.createIterator());
        while(menus.hasNext()){
            printMenu(((Menu)menus.next()).createIterator());
        }
	}
	private void printMenu(Iterator iter){
		while(iter.hasNext()){
			MenuItem item = (MenuItem)iter.next();
			System.out.println(item.getDescription()+item.getName()+item.getPrice()+item.isVegetarian());
		}
	}
}
