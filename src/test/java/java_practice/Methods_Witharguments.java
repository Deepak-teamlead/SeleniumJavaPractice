package java_practice;
public class Methods_Witharguments {
//Method with Arguments
   public void intadd(int a, int b) {
	int c=a+b;
	System.out.println("addition of numbers is : "+ c);
	}
   public void Stringadd(String k,String l) {
	   String m=k.concat(l);
	   System.out.println("Concat of two Strings : "+ m);
   }
   public static void main(String[] args) {	
	Methods_Witharguments obj=new Methods_Witharguments();
	obj.intadd(1,2);
	obj.intadd(5,5);
	//*******************************
	obj.Stringadd("Rock","Brock");
	obj.Stringadd("Snake","Cake");
	}
}
