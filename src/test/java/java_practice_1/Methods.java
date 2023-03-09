package java_practice_1;
public class Methods {
//Methods in Java...Static and Non-Static methods
public static void staticm1() {
	int a=10; int b=20;
	int c=a+b;
	System.out.println(c);
}
public void nonstaticm2() {
	int k=2; int l=2;
	int m=k*l;
	System.out.println(m);
}
public static void main(String[] args) {	
	staticm1();   //Calling Static Method
	staticm1();
//***************************************************	
	Methods o=new Methods();
	o.nonstaticm2();    //Calling Non-Static Method By Creating Object
	o.nonstaticm2();

	}

}
