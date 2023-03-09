package java_practice_1;
public class Method_overriding_child_5july extends Method_overriding_parent_5july{
	// Method Overriding-child class having same method as parent class
	public void m1() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		Method_overriding_child_5july obj=new Method_overriding_child_5july();
		obj.m1();
		Method_overriding_parent_5july obj1=new Method_overriding_parent_5july();
		obj1.m1();
	

	}

}

