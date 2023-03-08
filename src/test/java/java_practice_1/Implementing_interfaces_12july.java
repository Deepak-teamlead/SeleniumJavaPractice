package java_practice_1;
public class Implementing_interfaces_12july implements Interface_1_12july,Interface_2_12july{
//This class implements 2 interfaces (Interface_1_12july, Interface_2_12july) so we achieved Multiple Inheritance using Interface Concept
public void m1() {

    System.out.println("This is m1 implementation");
}
public void m2() {

    System.out.println("This is m2 implementation");
}
public static void main(String[] args) {	
Implementing_interfaces_12july obj=new Implementing_interfaces_12july();
obj.m1();
obj.m2();



}
}
	
	
	
	
	
	
	

