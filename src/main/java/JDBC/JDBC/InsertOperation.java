package JDBC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//String empid="104";
		//String empname="Rajesh";
		//String empsalary="25000";
		
		String url="jdbc:postgresql://localhost:5432/kanerika";
		String user="postgres";
		
		
		String pass="Krishna";
		//load Driver
		Class.forName("org.postgresql.Driver");
		Connection conn=DriverManager.getConnection(url,user,pass);
		
		
		//writing Query
		
		String query = "insert into public.employee(empname,empsalary) values('Nag','75000')";
		//createStatement
		Statement stat=conn.createStatement();
			
		int r = stat.executeUpdate(query);
		System.out.println("Sucessfully inserted values into employee table ");
        conn.close();
                  
	}

}
