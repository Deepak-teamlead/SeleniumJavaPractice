package java_practice;

// Multi level Inheritance

class A1{
    String a1;
    void m1(){
        System.out.println(a1);
    }


}
class A2 extends A1 {
    String a2;
    void m2(){
        System.out.println(a2);
    }

}
class A3 extends A2{
    String a3;
    void m3(){
        System.out.println(a3);
    }

}
public class Inheritance_MultiLevel {
    public static void main(String[] args) {

        A3 obj=new A3();   // from A3 we can access A2 class mebers and A1 class members
        obj.a1="rock";
        obj.m1();
        obj.a2="snake";
        obj.m2();
        obj.a3="cake";
        obj.m3();

    }
}
