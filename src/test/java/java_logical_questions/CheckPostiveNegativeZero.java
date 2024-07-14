package java_logical_questions;

public class CheckPostiveNegativeZero {
    // Java program to check whether a number is positive, negative or zero using if-else ladder concept
    public static void main(String[] args) {
        int num=10;  // change a value to positive, negative and zero and see output

        if(num>0){
            System.out.println("a is postive: "+num);
        } else if (num<0)
        {
            System.out.println("a is negative: "+num);
        }else
        {
            System.out.println("a is zero: "+num);
        }
    }
}
