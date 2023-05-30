package java_practice;

public class This_Method
{
    public This_Method(){
        this(10);
        System.out.println("super class constructor without arguments");
    }
    public This_Method(int a){
        System.out.println("super class constructor with arguments and value of a is "+a);
    }

    public static void main(String[] args) {
        This_Method o=new This_Method();

    }




}
