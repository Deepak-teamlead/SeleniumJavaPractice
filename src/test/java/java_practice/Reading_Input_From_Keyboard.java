package java_practice;
import java.util.Scanner;
public class Reading_Input_From_Keyboard {
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
		System.out.println("Addition of a and b is : " + c);
        s.close();
}
}