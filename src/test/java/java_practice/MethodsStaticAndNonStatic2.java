package java_practice;
public class MethodsStaticAndNonStatic2 {
	// Accesing static and static methods of other class
	public static void main(String[] args) {
		MethodsStaticAndNonStatic1.m1();   //calling static method of different class with classname.methodname
		MethodsStaticAndNonStatic1 obj=new MethodsStaticAndNonStatic1();
		obj.m2();        //calling non-static method of different class with object creation
	}
}

