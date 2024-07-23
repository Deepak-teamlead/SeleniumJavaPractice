package java_practice;
public class MethodsStaticAndNonStatic1 {
//Methods in Java...Static and Non-Static methods
// Static and non-static methods
public static void m1(){
	System.out.println("This is static method m1");
}
	public void m2(){
		System.out.println("This is not static method m2");
	}
	public static void main(String[] args) {
		m1();       // calling static method of same class directly without object creation
		MethodsStaticAndNonStatic1 obj=new MethodsStaticAndNonStatic1();
		obj.m2();   // calling non-static method of same class with object creation

	}

}
