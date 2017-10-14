package boqingan;

public class MenuTestDrive {
	public static void main(String[] args) {
		HouseMenu hm = new HouseMenu();
		DinerMenu dm = new DinerMenu();
		Waitress wt = new Waitress(hm,dm);
		wt.printMenu();
	}
}
