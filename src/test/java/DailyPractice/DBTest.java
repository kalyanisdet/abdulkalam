package DailyPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws Exception {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employees", "root", "");
	Statement stmt=con.createStatement();
	stmt.execute("insert into employees values(1,'Om',50,'CSE',5000)");
	System.out.println("Latest changes");
		
		
		

	}

}
