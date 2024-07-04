package selenium_practice;

public class NonStaticVariables {
    int a=10;
    public static void main(String[] args) {
        NonStaticVariables obj= new NonStaticVariables();
        // Accesing Non static varaible with object
        System.out.println(obj.a);
    }
}
