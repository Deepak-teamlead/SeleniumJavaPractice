package java_practice;
// this() is used to call constructor of same class
// super() is used to call constructor of super class.
public class ThisAndSuperMethods {
    public static void main(String[] args) {
        B obj = new B();
    }
}
    class A{
        A(){
            System.out.println("A-Default constructor-super class");
        }
        A(int a){
            System.out.println("A-parameterized constructor-super class: " +a);
        }

    }
    class B extends A{
        B(){
            //super();       // to execute super class Default constructor. super() is always present in first line of every constructor even if we don't mention
            //super(5);   // to execute super class parameterized constructor
            this(5);   // to execute sub class parameterized constructor
            System.out.println("B-Default constructor-sub class");
        }
        B(int a){
            System.out.println("B-parameterized constructor-sub class: " +a);
        }
    }

