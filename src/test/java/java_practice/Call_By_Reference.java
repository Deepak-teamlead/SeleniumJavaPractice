package java_practice;
public class Call_By_Reference {
    // call by reference
    public static int update( int number ){
        // increments number.
        number++;
        return number;
    }
    public static void main(String[] args) {
        int number = 1;
        // printing before update.
        System.out.println("number = " + number);
        // update function returns a value.
        number = update(number);
        // printing after update.
        System.out.println("number = " + number);
    }


}

