package java_practice_1;
abstract class c1{
	public abstract void m1();
	public void m2() {
		System.out.println("This is normal method m2");
	}
}
class c2 extends c1{
	public void m1() {
		System.out.println("m1 implementation in derived class");
	}
}
public class Abstratcmethod_abstractclass_11july {
	public static void main(String[] args) {
    c2 obj=new c2();
    obj.m1();
    obj.m2();
	
}
}	
	


