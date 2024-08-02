package java_practice;
import java.util.Scanner;
public class Exception_Handling {
//try, catch and finally blocks	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter number x");
	int x = sc.nextInt();
	System.out.println("enter number y");
	int y = sc.nextInt();
	try {
		System.out.println("divison is : " + x / y);
	} catch (Exception e) {
		System.out.println("in catch block and exception is :" + e.getMessage());
	} finally {                                               // finally is optional block
		System.out.println("This Is Finally Block");
	}
	System.out.println("last line of program");

	/*String s=null;
	try{
		System.out.println("length is: "+s.length());
	}catch(Exception e){
		System.out.println("in catch block and exception is :"+e.getMessage());
	}
	finally {
		System.out.println("This Is Finally Block");
	}
	System.out.println("last line of program");*/

	sc.close();

}
}
