import java.util.Scanner;

public class Circle extends Figures {
	protected double radius;
	protected double diameter;

	Circle(double radius) throws Exception {
		this.radius = radius;
		setFigureColor();
		setDiameter();
		setPerimeter();
		setSquare();

	}

	Circle(String figureTypes) throws Exception {
		setInput();
		setFigureColor();
		setDiameter();
		setPerimeter();
		setSquare();
		setFigureType(figureTypes);
		getInfo();
		

	}

	public void setInput() {
		boolean flg1 = true;
		while (flg1) {
			System.out.println("Введите радиус круга:");
			Scanner reader = new Scanner(System.in);

			if (reader.hasNextDouble()) {
				radius = reader.nextDouble();
				if (radius <= 0) {
					radius = 0;
					System.out.println("Введите число больше нуля!!! ");
				} else {
					flg1 = false;
				}
				// reader.close();
			} else
				System.out.println("Введите число!!! ");

		}
	}

	public void setPerimeter() {
		perimeter = radius * Math.PI * 2;
	}

	public void setDiameter() {
		diameter = radius * 2;
	}

	public void setSquare() {
		square = Math.pow((radius * Math.PI), 2);
	}

	public void getInfo() {
		System.out.println("Фигура: " + figureType 
				+ "\nПлощадь: " + square
				+ "\nПериметр: " + perimeter 
				+ "\nЦвет: " + color
				+ "\nРадиус: " + radius 
				+ "\nДиаметр: " + diameter + ";");

	}
}
