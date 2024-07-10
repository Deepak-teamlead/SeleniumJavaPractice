package java_practice;
public class NesteIfCondition {
// Nested if condition
    public static void main(String[] args) {
        if(true){    // change to false will execute only outer else
            if(true)  // change to false will execute inner else
            {
                System.out.println("true inner if");
            }
            else {
                System.out.println("false inner if");
            }
        }
        else
        {
            System.out.println("false outer if");
        }
    }
}
//Syntax - if (condition1) {
//        if (condition2) {
//        // Statements
//        }
//        else {
//        // Statements
//        }
//        }
//        else {
//        // Statements
//        }

