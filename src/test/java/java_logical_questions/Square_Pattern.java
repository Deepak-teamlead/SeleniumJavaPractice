package java_logical_questions;
public class Square_Pattern {
    public static void main(String[] args) {
    // square pattern
        int n = 5;
        for (int i = 1;i<=n;i++ ){     // outer loop i represents row
            for (int j=1;j<=n;j++){    // inner loop j represents column for row i=1 inner loop runs completely prints 5 stars next row i=2
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
  /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *

           */
