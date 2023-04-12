package java_logical_questions;
public class Increasing_Triangle_Pattern {
    // Increasing Traingle Pattern
    // for square pattern code if we make small change it becomes Increasing Traingle Pattern
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){    // outer loop i represents row
            for(int j=1;j<=i;j++){       // inner loop j represents column here we are telling inner loop to run based on row value i. first i=1 so inner loop runs once next i=2 so inner loop runs twice and so on
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
 *
 * *
 * * *
 * * * *
 * * * * *

 */