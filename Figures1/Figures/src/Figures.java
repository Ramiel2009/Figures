import java.sql.*;
import java.util.Scanner;

public class Figures {
	protected double perimeter;
	protected double square;
	protected String color;
	protected String figureType;
	

	Figures() throws Exception {
		
		
	}
	
	Figures(String figureType) throws Exception {
		this.figureType = figureType;
		setFigureColor();
	}


	
	public void setFigureType(String figureType) throws Exception {
	
		this.figureType = figureType;
		
	}

	public void setFigureColor() throws Exception {
		int maxid;
		int rid;
		
		Class.forName("org.sqlite.JDBC");
		Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\WorkSpases\\Eclipse\\Figures\\Database\\testdb.db");
		Statement stm = connection.createStatement();
		ResultSet result1 = stm.executeQuery("SELECT MAX(COLOR_ID)  as COLOR_ID FROM COLOR");
		maxid = result1.getInt("COLOR_ID");
		
		stm.close();
		PreparedStatement statement = connection.prepareStatement("select COLORNAME from COLOR where COLOR_ID = ?");
		rid=(int)(Math.random()*maxid);
		rid = (rid==0)?rid+1:rid;
		
			statement.setInt(1, rid);
		
		
		
		ResultSet colorName = statement.executeQuery();
		color = colorName.getString("COLORNAME");
		statement.close();
		
	}
	
	public  String getFigureType(){
		return figureType;
		
	}
	
	public void getInfo() {
		System.out.println("Фигура: " + figureType + "\nПлощадь: " + square
				+ "\nПериметр: " + perimeter + "\nЦвет: " + color + ";");

	}
	
	


}
