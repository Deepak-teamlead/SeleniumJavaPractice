package java_practice;
// Hierarchical Inheritance

class Parent{
    void m(){
        System.out.println("Parent class method");
    }
}
class Child1 extends Parent{
    void m1(){
        System.out.println("Child 1 class method");
    }
}
class Child2 extends Parent{
    void m2(){
        System.out.println("Child 2 class method");
    }
}

public class Inheritance_Hierarchical {
    public static void main(String[] args) {
        Child1 obj=new Child1();
        obj.m1();
        obj.m();

        //*****************************************

        Child2 obj1=new Child2();
        obj1.m2();
        obj1.m();

    }
}
