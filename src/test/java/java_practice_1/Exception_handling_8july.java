package java_practice_1;
import java.util.Scanner;
public class Exception_handling_8july {
//try, catch and finally blocks	
public static void main(String[] args) {
int a; int b; int c;
Scanner s=new Scanner(System.in);
System.out.println("enter a value :");
a=s.nextInt();
System.out.println("enter b value :");
b=s.nextInt();
/*try {
c=a/b;
System.out.println("Division of a and b is : "+ c);
}catch(Exception e) {
	System.out.println(e);
}*/
try {
c=a/b;
System.out.println("Division of a and b is : "+ c);
}
finally {
	System.out.println("This Is Finally Block");
}
s.close();	
System.out.println("***************Last Line Of Program******************");	

}
}
