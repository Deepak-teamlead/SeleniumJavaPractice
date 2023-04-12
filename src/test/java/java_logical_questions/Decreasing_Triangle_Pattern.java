package java_logical_questions;
public class Decreasing_Triangle_Pattern {
    // Decreasing Triangle Pattern
    // for square pattern code if we make small change it becomes Decreasing Traingle Pattern
 public static void main(String[] args) {
     int n=5;
     for(int i=1;i<=n;i++){
         for (int j=i;j<=n;j++){
             System.out.print("* ");
         }
         System.out.println();
     }
 }
}
/*
 * * * * *
 * * * *
 * * *
 * *
 *

 */