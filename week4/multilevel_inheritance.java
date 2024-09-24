import java.util.*;

class B extends C {
    public void show2(){
        System.out.println("this is grand child class.");
    }
    public static void main(String[] args) {
           B obj=new B();
           obj.show();
           obj.show1();
           obj.show2();
    }
}
class C extends A{
    public void show1(){
        System.out.println("This is child class.");
    }
}
class A{
    public void show(){
        System.out.println("This is parent class.");
    }
}

output:
This is parent class.
This is child class.
this is grand child class.
