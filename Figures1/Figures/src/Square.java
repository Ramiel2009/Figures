import java.util.Scanner;

public class Square extends Figures {

	protected double a;
	
	Square(double a) throws Exception{
		this.a = a;
		setFigureColor();
		setPerimeter();
		setSquare();
		
	}
	
	Square(String figureTypes) throws Exception{
		setInput();
		setFigureColor();
		setPerimeter();
		setSquare();
		setFigureType(figureTypes);
		getInfo();
		
	}
	
	public void setInput() {
		boolean flg = true;
		while (flg) {
			System.out.println("¬ведите сторону квадрата:");
			Scanner reader = new Scanner(System.in);
			if (reader.hasNextDouble()) {
				a = reader.nextDouble();
				if(a<=0){
					a=0;
				System.out.println("¬ведите число больше нул€!!!");
				} else{
					flg = false;
					}
				
			} else
				{System.out.println("¬ведите число!!!");}
			
		}
		
	}
	
	public void setPerimeter() {
		perimeter = a * 4;
	}

	public void setSquare() {
		square = Math.pow(a, 2);
	}
}
