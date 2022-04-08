package java_practice_1;
public class Method_overriding_child_5july extends Method_overriding_parent_5july{
	public void m1(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}		
	public static void main(String[] args) {
		Method_overriding_parent_5july obj=new Method_overriding_parent_5july();
		obj.m1(1,2);
		obj.m1(5,5);
	

	}

}
