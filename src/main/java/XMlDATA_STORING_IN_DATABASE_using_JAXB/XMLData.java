package XMlDATA_STORING_IN_DATABASE_using_JAXB;

import java.io.File;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class XMLData {

	public static void main(String[] args) throws JAXBException, ClassNotFoundException, SQLException,
			IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/kanerika";
		String user = "postgres";
		String pass = "Krishna";

		File file = new File("C:\\programs\\JDBC\\src\\main\\java\\XmlConverting\\dataset.xml");
		JAXBContext context = JAXBContext.newInstance(UnMarshalEmployee.class);
		Unmarshaller unmarsh = context.createUnmarshaller();
		UnMarshalEmployee unemployee = (UnMarshalEmployee) unmarsh.unmarshal(file);
		ArrayList<Employee> array = unemployee.getList();

		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstmt = conn.prepareStatement(
				"INSERT INTO employeepersonal(\n" + " empid,empname,empmail)\n" + "values(?, ?, ?)\n");
		
		for (Employee employee : array) {
			int i = 1;
			Class<?> test = employee.getClass();
			Field[] field = test.getDeclaredFields();
			for (Field filed : field) {
				filed.setAccessible(true);
				if (filed.getType() == int.class) {
					pstmt.setInt(i, filed.getInt(employee));
					i++;
				} else {
					pstmt.setString(i, filed.get(employee).toString());
					i++;
				}
			}
			pstmt.execute();
		}
	}

}
