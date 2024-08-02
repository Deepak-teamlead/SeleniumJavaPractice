package java_practice;
public class ThisAndSuperKeywords {

    // This and super keywords with variables
    //This keyword is used to call variables and methods of same class.
   // Super Keyword is used to call variables and methods of super class.
    public static void main(String[] args) {

        y obj = new y();
        obj.display();

    }
}
class x{
        int a = 10;

    }
    class y extends x {
        int a = 20;
        public void display(){
           // System.out.println(super.a);    // super keyword prints super class variable value 10
            System.out.println(this.a);     // this keyword prints same class variable value 20
        }
}



