package java_practice;
public class Encapsulation2 {


public static void main(String[] args) {

	Encapsulation1 obj=new Encapsulation1();

	// Accessing private variables outside class
	obj.setEmpid(101);
	obj.setEmpname("Rocky");
	obj.setEmpsalary(50000);
	System.out.println(obj.getEmpid());
	System.out.println(obj.getEmpname());
	System.out.println(obj.getEmpsalary());
		
	
	
	
	

	}

}
