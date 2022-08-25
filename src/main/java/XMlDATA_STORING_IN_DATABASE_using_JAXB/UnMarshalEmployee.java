package XMlDATA_STORING_IN_DATABASE_using_JAXB;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataset")

public class UnMarshalEmployee {
	@XmlElement(name="employee")
	private ArrayList<Employee> list=new ArrayList<Employee>();

	public ArrayList<Employee> getList() {
		return list;
	}
	

	

}
