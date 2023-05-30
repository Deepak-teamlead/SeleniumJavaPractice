package java_practice;
public class Final_Methods_Child extends Final_Methods_Parent {
	public void m1() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		Final_Methods_Parent o=new Final_Methods_Parent();
		o.m1();
        
		
		
	}

}
