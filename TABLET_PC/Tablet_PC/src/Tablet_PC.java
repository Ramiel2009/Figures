public class Tablet_PC {
	String color;
	int battery;
	String matrix;

	Tablet_PC(String color, int battery, String matrix) {
		this.color = color;
		this.battery= battery;
		this.matrix = matrix;
		
		
	}
	
	public void getInfo(){
		System.out.println("color: "+color+"\n"
				+"battery: "+battery+"\n"
				+"matrix: "+matrix+"\n"
				);
	}

}
