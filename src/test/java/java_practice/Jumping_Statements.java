package java_practice;
public class Jumping_Statements {
public static void main(String[] args) {
//Jumping Statements or Jump Statements
//break statement
int i;
for(i=1;i<=10;i++) {
	if(i==5) 
	break;	      //loop will stop when i=5 and will stop rest of loop execution
		System.out.println(i);
}
System.out.println("Break Statement Output= 1,2,3,4");	
//continue statement
int j;
for(j=1;j<=10;j++) {
	if(j==5) 
	continue;	      //loop will leave when i=5 and will continue the rest of execution
		System.out.println(j);
}
System.out.println("Continue Statement Output= 1,2,3,4,6,7,8,9,10");		
	
	
	
	
	
	
}
}
