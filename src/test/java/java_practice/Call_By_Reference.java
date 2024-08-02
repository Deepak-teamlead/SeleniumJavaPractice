package java_practice;
public class Call_By_Reference {
    // call by reference
    public int update( int x ){
        // increments number.
        x++;
        return x;
    }
    public static void main(String[] args) {
         int x = 1;
        // printing before update.
        System.out.println("before call by reference number = " + x);
        // update method returns a value.
        Call_By_Reference obj=new Call_By_Reference();
        System.out.println("after call by reference number = " +obj.update(x));
    }
}

