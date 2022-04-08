package java_practice_1;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist_14july {
//Array List and Its Methods	
public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add(1);
al.add("deepak");
al.add(true);
al.add(12.5);
System.out.println("Elements in Array List:"+al);
//******************************
al.remove(3);
System.out.println("Elements after remove:"+al);
//******************************
al.add(3,11.5);    //add(index,element)
System.out.println("Elements after add(index,element):"+al);
//*******************************	
al.remove(3);
System.out.println("Elemenst after remove(index):"+al);
//*******************************	
System.out.println("Gets Element at Index:"+al.get(1));      //Gets Element at Index 1
//******************************
al.set(1,"rocky");
System.out.println("Replaces Element at Index:"+al);
//********************************
System.out.println(al.isEmpty());         //Output is false
//*******************************
System.out.println(al.contains(1));        //Output is True
//**********************************
ArrayList al_dummy=new ArrayList();	
al_dummy.addAll(al);                    //Adds all elements in Array List to new Array List    
System.out.println(al_dummy);
//***********************************
ArrayList sort=new ArrayList();
sort.add("x");
sort.add("y");
sort.add("z");
sort.add("a");
sort.add("b");
//sort.add(null);
System.out.println("Array List sort Before Sorting:"+sort);
Collections.sort(sort);
System.out.println("Array List sort After Sorting:"+sort);
}
}
