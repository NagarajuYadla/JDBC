

package JDBC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url="jdbc:postgresql://localhost:5432/kanerika";
		String user="postgres";
		String pass="Krishna";
		//load Driver
		Class.forName("org.postgresql.Driver");
		//Creating Connection
		Connection conn=DriverManager.getConnection(url, user, pass);
		//Preparing Statements
		Statement stat=conn.createStatement();
		//writing Query
		String query="delete from employee where empid=101";
		int r=stat.executeUpdate(query);
		
		System.out.println("Sucessfully deleted");
		
		
		
		

		

	}

}
