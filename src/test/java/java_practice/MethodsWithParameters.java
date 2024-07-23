package java_practice;
public class MethodsWithParameters {
//Method with parameters
public void persondetails(String name,int age){
	System.out.println("person name is: "+name+"   person age is: "+age);
}
public void sum(int a,int b,int c) {
	System.out.println("sum of three numbers is:  " + (a + b + c));
}
public static void main(String[] args) {
	MethodsWithParameters obj=new MethodsWithParameters();
	obj.persondetails("Rock",13);
	   obj.sum(1,1,1);
	}
}
