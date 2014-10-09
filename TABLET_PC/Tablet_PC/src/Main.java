
public class Main {

	public static void main(String[] args) {
		Tablet_PC [] tabs = new Tablet_PC[3];
		
		GalaxyTab3 tab = new GalaxyTab3("white", 6, "M1", "GPS1");
		tabs[0] = tab;
		tabs[1] = new Tablet_PC("white", 6, "M1");
		tabs[1].getInfo();
	}

}
