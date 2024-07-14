package java_logical_questions;

public class PrintWeekNames {
   // Java program to Print week names based on week numbers
    public static void main(String[] args) {
        int weeknumber=70;    // change weeknumber from 1to 7 or greater than 7 and see output
        if(weeknumber==1){
            System.out.println("Monday 1 week number is: "+weeknumber);
        } else if (weeknumber==2)
        {
            System.out.println("Tuesday 2 week number is: "+weeknumber);
        }else if (weeknumber==3)
        {
            System.out.println("Wednesday 3 week number is: "+weeknumber);
        } else if (weeknumber==4)
        {
            System.out.println("Thursday 4 week number is: "+weeknumber);
        } else if (weeknumber==5)
        {
            System.out.println("Friday 5 week number is: "+weeknumber);
        } else if (weeknumber==6)
        {
            System.out.println("saturday 6 week number is: "+weeknumber);
        } else if (weeknumber==7)
        {
            System.out.println("Sunday 7 week number is: "+weeknumber);
        }
        else
        {
            System.out.println("Invalid week number");
        }

    }

}
