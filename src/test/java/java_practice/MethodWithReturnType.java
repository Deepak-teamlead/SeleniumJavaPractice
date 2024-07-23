package java_practice;

public class MethodWithReturnType {
    // method with return type
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodWithReturnType obj=new MethodWithReturnType();
        System.out.println(obj.sum(1,1,1));
    }
}
