package java_practice;

public class ActualAndFormalParameters {
    // actual and formal parameters
    public void method1(int a, int b){  // here a and b are formal parameters
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        ActualAndFormalParameters o=new ActualAndFormalParameters();
        o.method1(1,2);   // here 1 and 2 are actual parameters

    }
}
