package java_logical_questions;
import java.util.Scanner;
public class Reverse_a_String {
public static void main(String[] args) {
String s="abcd";
String rev="";
for(int i=s.length()-1; i>=0; i--) {
	rev= rev+s.charAt(i);
	}
	System.out.println("reversed string is :"+rev);
   //using scanner class taking input from user
	Scanner sc=new Scanner(System.in);
	String s1="";
	String rev1="";
	System.out.println("enter string to be reversed");
	s1=sc.next();
	for (int j=s1.length()-1;j>=0;j--){
		rev1=rev1+s1.charAt(j);
	}
	System.out.println("reversed string taking input from user is :"+rev1);

}
}
