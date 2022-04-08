package java_practice_1;
import java.util.Scanner;
public class Reading_input_from_keyboard_8july {
public static void main(String[] args) {
		int a; 
		int b; 
		int c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value : ");
		a=s.nextInt();
		System.out.println("Enter b value : ");
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition of two numbers c=a+b is : " + c);
        s.close();
	
	
	
}
}