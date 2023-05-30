package java_practice;
public class Variables3 {
//Non static variables
public int k=11;
public int l=22;
public int m=k+l;
public static void main (String args[]) {
//Creating object to access Non static variables
Variables3 obj=new Variables3();
System.out.println(obj.m);
//***********************************************************
//accessing static variables of other class (Variables_2_2july ).....with classname.variable
//as they are static variables we can access directly without object creation
System.out.println(Variables2.a+ Variables2.b);




	
}
}