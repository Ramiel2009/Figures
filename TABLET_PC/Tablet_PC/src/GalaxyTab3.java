
public class GalaxyTab3 extends Tablet_PC{
	String GPS;
	public GalaxyTab3(String color, int battery, String matrix, String GPS) {
		super(color, battery, matrix);
		this.GPS = GPS;
		getInfo();
	}

	public void getInfo(){
		System.out.println(
				"color: "+color+"\n"
				+"battery: "+battery+"\n"
				+"matrix: "+matrix+"\n"
				+"GPS: "+GPS+"\n");
	}
}
