import java.util.Scanner;


public class Triangle extends Figures {
	protected double a;
	protected double b;
	protected double c;
	protected double corner;
	
	Triangle(double a, double b, double c) throws Exception{
		this.a = a;
		this.b = b;
		this.c = c;
		setFigureColor();
		setPerimeter();
		setSquare();
	}
	
	Triangle() throws Exception{
		setFigureColor();
		setInput();
		setPerimeter();
		setSquare();
	}
	
	public void setInput() {
		boolean flg = true;
		while (flg) {
			System.out.println("������� ������ 1-��  ������ ������������:");
			Scanner reader = new Scanner(System.in);
			if (reader.hasNextInt() || reader.hasNextDouble()) {
				a = reader.nextDouble();
				flg = false;
				
			} else
				System.out.println("������� �����!!!");
		}
		
		flg=true;
		while (flg) {
			System.out.println("������� ������ 2-��  ������ ������������:");
			Scanner reader = new Scanner(System.in);
			if (reader.hasNextInt() || reader.hasNextDouble()) {
				b = reader.nextDouble();
				flg = false;
				
			} else
				System.out.println("������� �����!!!");
		}
		flg=true;
		while (flg) {
			System.out.println("������� ������ ���������� ������������:");
			Scanner reader = new Scanner(System.in);
			if (reader.hasNextInt() || reader.hasNextDouble()) {
				c = reader.nextDouble();
				flg = false;
				//reader.close();
			} else
				System.out.println("������� �����!!!");
		}
	}
	
	public void setPerimeter() {
		perimeter = a+b+c;
	}

	public void setSquare() {
		square = Math.pow((perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c)), 0.5);
	}

	public void getInfo() {
		System.out.println("������: " + figureType 
				+"\n����� �: " + a + ";"
				+"\n����� b: " + b + ";"
				+"\n���������� c: " + c + ";"
				+"\n�������: " + square + ";"
				+"\n��������: " + perimeter 
				+"\n����: " + color + ";");
	}
}

