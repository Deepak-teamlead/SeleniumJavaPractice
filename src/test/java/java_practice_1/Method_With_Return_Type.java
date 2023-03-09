package java_practice_1;

public class Method_With_Return_Type {
    // method with return type
    public int m1(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Method_With_Return_Type obj=new Method_With_Return_Type();
        int result=obj.m1(1,2);
        System.out.println(result);
    }
}
