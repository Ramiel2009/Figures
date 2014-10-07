import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
	
	String[] figureTypes = { "����", "�������", "�����������" };
		boolean flg = true;
		String read;
		while (flg) {
			int i = 1;
			Scanner reader = new Scanner(System.in);
			System.out.println("\n���������� �������� ������: [Q] - �����");
			for (String ftypes : figureTypes) {
				System.out.println(i + ". - " + ftypes);
				i++;
			}
			read = reader.nextLine();
			switch (read) {
			case "1":
				Circle circle = new Circle();
				circle.setFigureType(figureTypes[0]);
				circle.getInfo();
				//reader.close();
				break;
			case "2":

				Square square = new Square();
				square.setFigureType(figureTypes[1]);
				square.getInfo();
				//reader.close();
				break;
			case "3":

				Triangle triangle = new Triangle();
				triangle.setFigureType(figureTypes[2]);
				triangle.getInfo();
				//reader.close();
				break;

			case "Q":
			case "q":
			case "�":
			case "�":
				flg = false; break;
			default:
				System.out.println("������������ ����");
				break;
			}
			//reader.close();
		}

	}
}
