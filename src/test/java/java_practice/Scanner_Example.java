package java_practice;
import java.util.Scanner;
public class Scanner_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();
        System.out.println("sum of two numbers is : " + (num1 + num2));
        sc.close();
    }
}
//    Scanner s=new Scanner(System.in);
//    System.out.println("enter a value");
//            int a=s.nextInt();
//            System.out.println("enter b vaue");
//            int b=s.nextInt();
//            int c=a+b;
//            System.out.println("addition of a and b is "+c);