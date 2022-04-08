package java_practice_1;
public class Constructor_chaining_subclass_7july extends Constructor_chaining_superclass_7july {
public Constructor_chaining_subclass_7july() {
	System.out.println("subclass No argument constructor");	
	}
public Constructor_chaining_subclass_7july(int x) {
	System.out.println("subclass argument constructor");
	System.out.println("Value of x : "+ x);
	}

public static void main(String[] args) {
	Constructor_chaining_subclass_7july o=new Constructor_chaining_subclass_7july(123);
	System.out.println(o);
	
}
}
