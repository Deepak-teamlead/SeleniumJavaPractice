package java_logical_questions;
public class Factorial_Of_A_Number {
    public static void main(String[] args) {
    // factorial of a number
    // factorial Example of 5----5!= 1*2*3*4*5
    // factorial Example of 10---10!=1*2*3*4*5*6*7*8*9*10
      int n=5;
      long factorial=1;
      for (int i=1;i<=n;i++){
          factorial=factorial*i;
      }
        System.out.println("factorial of given number is :"+factorial);
    }
}
