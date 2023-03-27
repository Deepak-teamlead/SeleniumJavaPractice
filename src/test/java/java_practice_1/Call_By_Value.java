package java_practice_1;
public class Call_By_Value {
	// call by value- original value variable "a" remains unchanged
	int a = 10;
	public void m1(int a) {
		a = a+10;
		System.out.println("value in method: "+a);
	}
	public static void main(String[] args) {
		Call_By_Value o=new  Call_By_Value();
		System.out.println("before call by value "+o.a); // variable a value
		o.m1(10);
		System.out.println("after call by value "+o.a);
}
}