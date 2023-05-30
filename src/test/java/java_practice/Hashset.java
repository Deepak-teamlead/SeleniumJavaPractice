package java_practice;
import java.util.HashSet;
public class Hashset {
	//Hashset and its methods
	public static void main(String[] args) {
	HashSet hs=new HashSet();
	//Adding elements
	hs.add(10);
	hs.add("deepak");
	hs.add(null);
	hs.add(12.2);
	hs.add(true);
	System.out.println(hs);  //o/p-[null, deepak, 10, 12.2, true].......Insertion order not maintained
	//remove element
	hs.remove(12.2);
	System.out.println("After removing element"+"  "+hs);
	//contains()
	System.out.println("contains method" +"  "+ hs.contains("deepak"));
	//isempty()
	System.out.println("isempty method" +"  "+ hs.isEmpty());
	//
	//we also have addall(), removeall() methods
		}
	
	
	
	
	
	
}
