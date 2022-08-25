package XMlDATA_STORING_IN_DATABASE_using_JAXB;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private int empid;
	private String empname;
	private String empmail;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empmail=" + empmail + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
	

}
