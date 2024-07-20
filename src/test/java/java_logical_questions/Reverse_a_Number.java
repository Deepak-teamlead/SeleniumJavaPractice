package java_logical_questions;
public class Reverse_a_Number {
    public static void main(String[] args) {
        // Reverse a number
        int number = 12345;
        while (number >0) {
           int remainder = number % 10;
            System.out.print(remainder);
            number = number / 10;
            // Reverse a number using StringBuffer class
      /*  StringBuffer sb = new StringBuffer(String.valueOf(12345));
        System.out.println(sb.reverse());*/
        }
    }
}