package java_logical_questions;
import java.util.Arrays;
public class Sort_Elements_In_Array {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        // sorting using sort() method of the Arrays class
        Arrays.sort(a);
        for(int i=0;i<=a.length;i++){
            System.out.println("Array Elements after sorting : " +a[i]);
        }
    }
}