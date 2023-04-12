package java_logical_questions;
public class Swap_Two_Numbers {
public static void main(String[] args) {

	// swapping two numbers using third varaible
	int a=10;
	int b=20;
	System.out.println("varaibles before swapping: "+a +" and "+b);
	int t=a;    // now t=10
	a=b;        // now a=20
	b=t;        // now b=10
	System.out.println("varaibles after swapping: "+a +" and "+b);
}

}
