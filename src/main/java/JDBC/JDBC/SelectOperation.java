package JDBC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.util.PSQLException;

public class SelectOperation {
  public static void main(String[] args) throws SQLException, ClassNotFoundException ,PSQLException{
	  
	  String url="jdbc:postgresql://localhost:5432/kanerika";
	  String user="postgres";
	  String pass="Krishna";
	  
	  Class.forName("org.postgresql.Driver");
	  Connection conn=DriverManager.getConnection(url, user, pass);
	  String query="select empname from employee where empid=102";
	  Statement stat=conn.createStatement();
	  ResultSet rs=stat.executeQuery(query);
	  rs.next();
	  String name=rs.getString("empname");
	  System.out.println(name);
	  stat.close();
  }
}
