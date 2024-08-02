package java_practice;

// Single Inheritance

class P{
String p="parent";
void parentMethod(){
    System.out.println("parent class method");
}
}
class C extends P{
    String c="child";
    void childMethod(){
        System.out.println("child class method");
    }
}
public class Inheritance_Single {

    public static void main(String[] args) {
        C obj=new C();
        System.out.println(obj.p);   // from child class we can access parent class variables and methods
        System.out.println(obj.c);
        obj.parentMethod();
        obj.childMethod();
    }

}
