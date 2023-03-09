package java_practice_1;
public class Final_Variable {
	//Final variables	
	int a=10;    //If we declare a as final we get compilation error in line 6 inside constructor because final variable value cannot be changed
	public Final_Variable(){
		a=20;
		System.out.println("Changed variable value inside constructor");
		System.out.println("value of a after changing is : " + a);
	}
	public static void main(String[] args) {	
		Final_Variable o=new Final_Variable();
		System.out.println(o);
	
	
	
	}	
}
