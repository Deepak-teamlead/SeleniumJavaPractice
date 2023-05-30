package java_practice;
public class Constructor {
//Constructor---A constructor is used to pass data to variables using objects
int a;
int b;
public Constructor() {
	a=10;
	b=20;
}
public Constructor(int x, int y) {
	a=x;
	b=y;
}
public static void main(String[] args) {
	Constructor o=new Constructor();
	System.out.println("Constructor value of a : "+ o.a);
	System.out.println("Constructor value of b : "+ o.b);
    //*****************************************
//Parameterized constructor
	Constructor o1=new Constructor(100,200);
	System.out.println("Parameterized Constructor value of a : "+ o1.a);
	System.out.println("Parameterized Constructor value of b : "+ o1.b);
	}

}
