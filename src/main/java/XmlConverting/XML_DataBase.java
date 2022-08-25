package XmlConverting;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML_DataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/kanerika","postgres", "Krishna");
		Statement stat=conn.createStatement();
		DocumentBuilderFactory dbfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder docbuilder=dbfactory.newDocumentBuilder();
		Document doc=docbuilder.parse(new File(("C:\\programs\\JDBC\\src\\main\\java\\XmlConverting\\dataset.xml")));
		doc.getDocumentElement().normalize();
		System.out.println("Root element of the doc is " + doc.getDocumentElement().getNodeName());
		NodeList listOfPersons=doc.getElementsByTagName("employee");
		for(int i=0;i<listOfPersons.getLength();i++)
		{
			Node persons=listOfPersons.item(i);
			if(persons.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element=(Element) persons;
				String name=element.getElementsByTagName("empname").item(0).getTextContent();
				String mail=element.getElementsByTagName("empmail").item(0).getTextContent();
				int result=stat.executeUpdate("insert into public.employeepersonal(empname,empmail)values('"+name+"','"+mail+"')");
				
			}
		}
		System.out.println("Data Sucessfully Inserted");
		

	}

}
