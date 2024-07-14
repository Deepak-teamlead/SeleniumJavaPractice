package java_practice;

public class SwitchCaseCondition2 {
public static void main(String[] args) {
    //    Print week number based on week names

 String week_names="friday";
switch(week_names) {
case "monday":
	System.out.println("1");
     break;
case "tuesday":
	System.out.println("2");
     break;
case "wednesday":
	System.out.println("3");
     break;
    case "thursday":
        System.out.println("4");
        break;
    case "friday":
        System.out.println("5");
        break;
    case "saturday":
        System.out.println("6");
        break;
    case "sunday":
        System.out.println("7");
        break;
        default:
	System.out.println("Animal value is not declared");
}
}
}
