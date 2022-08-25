package JAXB;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private int sid;
	private String sname;
	private int sfee;
	
	public int getSid() {
		return sid;
	}
	//@XmlElement(name = "Student Id")
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
	public String getSname() {
		return sname;
	}
	//@XmlElement(name = "Student Name")
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSfee() {
		return sfee;
	}
	//@XmlElement(name = "Student Fee")
	public void setSfee(int sfee) {
		this.sfee = sfee;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}
	public char[] getName(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
