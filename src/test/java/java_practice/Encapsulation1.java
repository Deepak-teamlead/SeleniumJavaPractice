package java_practice;
public class Encapsulation1 {
	// Encapsulation
	private int empid;
	private String empname;
	private int empsalary;

	// below are setter and getter methods for above private varaibles which are created by intelij feature
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public int getEmpsalary() {
		return empsalary;
	}
}

