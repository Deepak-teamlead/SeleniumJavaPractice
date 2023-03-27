package java_practice_1;

public class Super_This_Child extends Super_This_Parent{
    public void m1(){
        System.out.println("child method");
    }
    public void keyword(){
        super.m1();
      //  this.m1();
    }
    public static void main(String[] args) {
        Super_This_Child o=new Super_This_Child();
        o.keyword();
    }
}
