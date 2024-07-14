package java_logical_questions;

import java.util.ArrayList;
import java.util.Collections;
public class LargestOfThreeUsingCollections {
    // Java program to find Largest of three numbers using Collections.max() method and ArrayList
    public static void main(String[] args) {
        int a=5, b=10, c=3;
        // Considering random integers three numbers
        ArrayList<Integer> x = new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);
        // Printing the largest number
        System.out.println("largest of three numbers in the Arraylist is: "+Collections.max(x));
    }
}
