package java_logical_questions;
public class CountNumberOfDigits {
    // Program to count number of digits in a given number
    public static void main(String[] args) {
        int number=12345;
        int count = 0;
        while (number>0){
            number=number/10;
            count++;
        }
        System.out.println("Number of digits are : "+count);
    }
}
