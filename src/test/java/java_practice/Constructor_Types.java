package java_practice;
public class Constructor_Types {
//Constructor---A constructor is used to pass data to variables using objects
int studentid; String studentname; int marks;
Constructor_Types(){
		studentid=101;
		studentname="Rock";
		marks=95;
	}
	Constructor_Types(int stu,String nm,int mrks){    // parameterized constructor
		studentid=stu;
		studentname=nm;
		marks=mrks;
	}
public static void main(String[] args) {
	Constructor_Types obj=new Constructor_Types();
	System.out.println(obj.studentid+"  "+obj.studentname+"  "+obj.marks);
	//////////////////////////////////////////
	//*****************************************
//Parameterized constructor
	Constructor_Types obj1=new Constructor_Types(102,"Snake",90);
	System.out.println(obj1.studentid+"  "+obj1.studentname+"  "+obj1.marks);

	}

}
