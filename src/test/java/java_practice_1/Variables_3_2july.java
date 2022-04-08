package java_practice_1;
public class Variables_3_2july {
//Non static variables
public int k=11;
public int l=22;
public int m=k+l;
public static void main (String args[]) {
//Creating object to access Non static variables
Variables_3_2july obj=new Variables_3_2july();
System.out.println(obj.m);
//***********************************************************
//accessing static variables of other class (Variables_2_2july ).....with classname.variable
//as they are static variables we can access directly without object creation
System.out.println(Variables_2_2july.a+Variables_2_2july.b);




	
}
}