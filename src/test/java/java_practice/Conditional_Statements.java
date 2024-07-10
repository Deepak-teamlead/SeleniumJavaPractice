package java_practice;
public class Conditional_Statements {
public static void main(String[] args) {
	// First see individual java classes for if, if-else, nested-if
//Conditional statements..1)If Condition, 2)If-else Condition, 3)If-else-If or Nested-If Condition, 4)Switch Case Condition
//1)If Condition
int a=10; int b=20;
if(a<b) {
	System.out.println("If condition pass");
}
System.out.println("Rocky");	
//2)If-else Condition
int k=10; int l=2;
if(k<l) {
	System.out.println("Condition True...l is Greater");
}
else {
	System.out.println("Condition false...K is Greater");
}
//3)If-else-If or Nested-If Condition
int x=100; int y=200;
if (x==100) {
	if(y==200) {
		System.out.println("pass....If-else-If or Nested-If Condition");
	}
	else
	{
		System.out.println("fail....If-else-If or Nested-If Condition");
	}
}
System.out.println("************* If-else-If or Nested-If Condition **************");	
}
}
