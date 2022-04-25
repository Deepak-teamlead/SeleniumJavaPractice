package java_practice_1;
public class Type_Casting {
    public static void main(String[] args) {
     // Type casting is converting higher data type to lower data type...EX-long to int
        long l = 10;
        int i = (int) l;
        System.out.println("long value is "+ l);
        System.out.println("int value is "+ i);

    // Type conversion is converting lower data type to higher data type...EX-int to double
        int i1=100;
        double d=i1;
        System.out.println("int value is "+ i1);    //o/p- 100
        System.out.println("double value is "+d);   //o/p- 100.0

    }
}



