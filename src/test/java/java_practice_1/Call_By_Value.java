package java_practice_1;
public class Call_By_Value {
int x=50;  
public void change(int x){
System.out.println("before change inside method (argument) : " + x);	
x=x+100;//changes will be in the local variable only 
System.out.println("after change inside method (argument) : " + x);
}  
public static void main(String[] args) {	
	Call_By_Value obj=new Call_By_Value();
	System.out.println("before change : "+obj.x);  
	   obj.change(500);  
	   System.out.println("after change : "+obj.x);
	
}
}