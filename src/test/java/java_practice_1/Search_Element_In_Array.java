package java_practice_1;

public class Search_Element_In_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        for (int i = 0;i<a.length;i++){
            if(a[i]==3){
                System.out.println("element found at index  "+i);
                break;
            }
        }
    }
}
//    int[] x={1,2,3,4,5,6,7,8,9,10};
//        for(int i=0;i<x.length;i++){
//        if(x[i]==5){
//        System.out.println("element is found in array at index "+i);
//        continue;
//        }else{
//        System.out.println("element not found at index "+i);
//        continue;
//        }
//        }