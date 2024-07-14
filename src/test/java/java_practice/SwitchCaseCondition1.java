package java_practice;

public class SwitchCaseCondition1 {
    // Switch case condition
    // Print week names based on week number
    public static void main(String[] args) {
        int week_nubmer=6;

        switch (week_nubmer){
            case 1:                                // 1st case checking if weeknumber is 1 (condition) if true will execute code in case 1
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid week number");
        }
    }
}
