package JAXB;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Marshing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		student.setSid(101);
		student.setSname("Nagaraju");
		student.setSfee(25000);

		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Marshaller masher = context.createMarshaller();
			File file = new File("C:\\programs\\JDBC\\src\\main\\java\\JAXB\\student.xml");
			masher.marshal(student, file);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
