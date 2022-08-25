package JDBC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/kanerika";
		String user="postgres";
		String pass="Krishna";
		//load Driver
		Class.forName("org.postgresql.Driver");
		Connection conn=DriverManager.getConnection(url,user,pass);
		
		//writing Query
		
		String query = "update employee set empname='Revanth'where empid=105";
		//createStatement
		Statement stat=conn.createStatement();
			
		int r = stat.executeUpdate(query);
		System.out.println("Sucessfully updated values into employee table " );
        conn.close();

	}

}
