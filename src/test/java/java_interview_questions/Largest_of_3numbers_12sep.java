package java_interview_questions;
import java.util.Scanner;
public class Largest_of_3numbers_12sep {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter first number:");
int a=s.nextInt();
System.out.println("Enter second number:");
int b=s.nextInt();
System.out.println("Enter third number:");
int c=s.nextInt();
if(a>b && a>c) {
	System.out.println("a is greater"+a);
}
else
	if(b>a && b>c) {
		System.out.println("b is greater"+b);
	}
	else
		System.out.println("c is greater"+c);
s.close();
}
}
