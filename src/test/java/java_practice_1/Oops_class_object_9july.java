package java_practice_1;
public class Oops_class_object_9july {
//oops class and object...consider this class name was Dog
	String breed;
	int age;
	String colour;
	public void doginfo() {
		System.out.println("breed is:"+breed+"---age is:"+age+"---colour is:"+colour);
	}
	public static void main(String[] args) {
		Oops_class_object_9july d1=new Oops_class_object_9july();
		d1.breed="labrator";
		d1.age=5;
		d1.colour="white";
		d1.doginfo();
		//*****************************************
		Oops_class_object_9july d2=new Oops_class_object_9july();
		d2.breed="jermanshephard";
		d2.age=8;
		d2.colour="black";
		d2.doginfo();	
}	
}
