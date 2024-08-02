package java_practice;

public class ClassAndObjects2 {
    // program to show how objects work
    // accessing class member of ClassAndObjects1
    public static void main(String[] args) {
        ClassAndObjects1 obj=new ClassAndObjects1();
        obj.empid=101;            // declaring variables using object
        obj.empname="Deepak";
        obj.experience=5;
        obj.role="QA";
        //*******************************
        obj.displayEmploeedetails();    // calling method using object
        //*******************************
        ClassAndObjects1 obj1=new ClassAndObjects1();
        obj1.empid=105;
        obj1.empname="shivanshu";
        obj1.experience=2;
        obj1.role="Developer";
        //*******************************
        obj1.displayEmploeedetails();



    }
}
