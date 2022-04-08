package java_practice_1;
public class Methods_witharguments_5july {
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
	Methods_witharguments_5july obj=new Methods_witharguments_5july();
	obj.intadd(1,2);
	obj.intadd(5,5);
	//*******************************
	obj.Stringadd("Rock","Brock");
	obj.Stringadd("Snake","Cake");
	}
}
