package java_logical_questions;
public class Search_Element_In_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // printing element
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 5) {
                System.out.println("element found at :" + i);
                break;
            }
            }
        System.out.println("Element not found");
        }
}


