import java.util.*;

class B extends A {
    public void show2(){
        System.out.println("this is child class.");
    }
    public static void main(String[] args) {
           B obj=new B();
           obj.show();
           obj.show2();
    }
}
class A{
    public void show(){
        System.out.println("This is parent class.");
    }
}

output:
This is parent class.
this is child class.
