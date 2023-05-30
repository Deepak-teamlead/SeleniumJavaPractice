package java_practice;
public class Implementing_Interfaces implements Interface1, Interface2 {
//This class implements 2 interfaces (Interface_1_12july, Interface_2_12july) so we achieved Multiple Inheritance using Interface Concept
public void m1() {

    System.out.println("This is m1 implementation");
}
public void m2() {

    System.out.println("This is m2 implementation");
}
public static void main(String[] args) {	
Implementing_Interfaces obj=new Implementing_Interfaces();
obj.m1();
obj.m2();



}
}
	
	
	
	
	
	
	

