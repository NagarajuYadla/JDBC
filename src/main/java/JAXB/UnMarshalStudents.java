package JAXB;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="students")
public class UnMarshalStudents {
	@XmlElement(name="student")
	private ArrayList<Student> list=new ArrayList<Student>();

	public ArrayList<Student> getList() {
		return list;
	}

	

}
