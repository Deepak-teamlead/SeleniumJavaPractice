package java_practice_1;
public class Constructor_Chaining_Subclass extends Constructor_Chaining_Superclass {
public Constructor_Chaining_Subclass() {
	System.out.println("subclass No argument constructor");	
	}
public Constructor_Chaining_Subclass(int x) {
	System.out.println("subclass argument constructor");
	System.out.println("Value of x : "+ x);
	}

public static void main(String[] args) {
	Constructor_Chaining_Subclass o=new Constructor_Chaining_Subclass(123);
	System.out.println(o);
	
}
}
