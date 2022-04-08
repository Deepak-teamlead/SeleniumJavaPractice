package java_practice_1;
public class Constructor_chaining_superclass_7july {
	
	//Constructor chaining
	public Constructor_chaining_superclass_7july(){
		//this(1);
		System.out.println("superclass No argument constructor");
	}
	public Constructor_chaining_superclass_7july(int x){
		System.out.println("superclass argument constructor");
		System.out.println("Value of x : "+ x);
	}
	public static void main(String[] args) {
		Constructor_chaining_superclass_7july o=new Constructor_chaining_superclass_7july(333);
		System.out.println(o);
		
	}
}

