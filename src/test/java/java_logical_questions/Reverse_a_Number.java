package java_logical_questions;
public class Reverse_a_Number {
    public static void main(String[] args) {
        // Reverse a number
        int number=54321;
        int rem;
        int rev=0;
        while(number!=0){
            rem=number%10;   // % is Modulus operator it gives remainder of a number
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println("Reversed number is :"+rev);



    }
}
