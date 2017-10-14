package boqingan;
import boqingan.*;

public class MenuTestDrive {
	public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","lunch");
        MenuComponent cafeMenu= new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);
        
        dinerMenu.add(new MenuItem("Pasta","Spaghetti with marinara sauce,and a slice of sourdough bread",true,3.99));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie","Apple Pie with a flakey crust",true,1.89));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
	}
}
