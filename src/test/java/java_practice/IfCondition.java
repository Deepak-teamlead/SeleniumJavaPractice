package java_practice;
public class IfCondition {
    // if condition
    public static void main(String[] args) {
        int a=10;
        if(a>5){
            System.out.println("condition is true statement 1");
            System.out.println("condition is true statement 2");
        }
        System.out.println("this is outside first if block");
//        Output-
//                condition is true statement 1
//                condition is true statement 2
//                this is outside if block
        int x=10;
        if(x>50){
            System.out.println("condition is true statement 3");
            System.out.println("condition is true statement 4");
        }
        System.out.println("as condition is false only this will print");
//        output-
//                as condition is false only this will print
    }
}
//                syntax-
//                      if(condition){
//                      statements;
//                      }
