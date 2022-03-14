package adjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertExample {

	Public Static void main(String[]args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the driver class name");
		String dr=t.next();//com.mysql.cj.jdbc.Driver
		
		System.out.println("Enter URL");//jdbc:mysql://localhost:3306?user=root&&password=abcd&&useSSL=false
		String url=t.next();
		
		try {
			Class.forName(dr);
			System.out.println("loading and registering complete");
			Connection cn=DriverManager.getConnection(url);
			System.out.println("connection established");
			Statement st=cn.createStatement();
			
			st.executeQuery("insert into adjava values(101,'abc',40000)");
		}
		catch (ClassNotfoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
}
