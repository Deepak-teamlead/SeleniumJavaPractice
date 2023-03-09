package java_practice_1;
public class Constructor_Chaining_Superclass {
	
	//Constructor chaining
	public Constructor_Chaining_Superclass(){
		//this(1);
		System.out.println("superclass No argument constructor");
	}
	public Constructor_Chaining_Superclass(int x){
		System.out.println("superclass argument constructor");
		System.out.println("Value of x : "+ x);
	}
	public static void main(String[] args) {
		Constructor_Chaining_Superclass o=new Constructor_Chaining_Superclass(333);
		System.out.println(o);
		
	}
}

