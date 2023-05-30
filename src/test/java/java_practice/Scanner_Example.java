package java_practice;
import java.util.Scanner;
public class Scanner_Example {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Name is: " + name);
        s.close();
    }
}
//    Scanner s=new Scanner(System.in);
//    System.out.println("enter a value");
//            int a=s.nextInt();
//            System.out.println("enter b vaue");
//            int b=s.nextInt();
//            int c=a+b;
//            System.out.println("addition of a and b is "+c);