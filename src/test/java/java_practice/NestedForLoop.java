package java_practice;

public class NestedForLoop {
    // Nested for loop example
    public static void main(String[] args) {
        // Outer loop
        for(int i=1;i<=3;i++){
            System.out.println(i+ " -outerloop");   // executes 3 times
            // Inner loop
            for (int j=1;j<=2;j++){
                System.out.println(j+ " -innerloop"); // executes for every iteration of outer loop // The inner loop will execute one time for each iteration of the outer loop
            }
        }
        // Example 2:
    for(int x=1;x<=2;x++){
     for (int y=1;y<=4;y++){
         System.out.println("outer loop is "+x+" inner loop is "+y);
     }
    }
}
}