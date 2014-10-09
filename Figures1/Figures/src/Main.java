import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
	
	String[] figureTypes = { "Круг", "Квадрат", "Треугольник" };
		boolean flg = true;
		String read;
		while (flg) {
			int i = 1;
			Scanner reader = new Scanner(System.in);
			System.out.println("\nПожалуйста виберите фигуру: [Q] - выход");
			for (String ftypes : figureTypes) {
				System.out.println(i + ". - " + ftypes);
				i++;
			}
			read = reader.nextLine();
			switch (read) {
			case "1":
				Circle circle = new Circle(figureTypes[0]);				
				break;
			case "2":
				Square square = new Square(figureTypes[1]);
				break;
			case "3":

				Triangle triangle = new Triangle(figureTypes[2]);
				
				break;

			case "Q":
			case "q":
			case "й":
			case "Й":
				flg = false; break;
			default:
				System.out.println("Некорректный ввод");
				break;
			}
			//reader.close();
		}

	
}
/*1 - инициализация переменных родителя
 * 2выпол-я конструктор родителя
 * 3- ин-ся переменные ребенка*/
 */