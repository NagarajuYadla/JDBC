package JAXB;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class UnMarshing {

	public static void main(String[] args) throws JAXBException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		File file = new File("C:\\programs\\JDBC\\src\\main\\java\\JAXB\\student.xml");
		JAXBContext context = JAXBContext.newInstance(UnMarshalStudents.class);
		Unmarshaller unmarsh = context.createUnmarshaller();
		UnMarshalStudents students = (UnMarshalStudents) unmarsh.unmarshal(file);
		ArrayList<Student> array = students.getList();
		//Student student1 = array.get(0);
		//System.out.println(student1.toString());
		for(Student student : array)
		{
			System.out.println(student.toString());
		}
		
	}

}
