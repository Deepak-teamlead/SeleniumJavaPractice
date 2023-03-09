package java_practice_1;
public class Method_Overriding_Child extends Method_Overriding_Parent {
	// Method Overriding-child class having same method as parent class
	public void m1() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		Method_Overriding_Child obj=new Method_Overriding_Child();
		obj.m1();
		Method_Overriding_Parent obj1=new Method_Overriding_Parent();
		obj1.m1();
	

	}

}

