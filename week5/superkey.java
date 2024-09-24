import java.util.*;

class B extends A{
    public void show(){
        System.out.println("this is child class.");
    }
    public void display(){
        super.show();
        show();
    }
    public static void main(String args[]){
        B obj = new B();
        obj.display();
    }
}
class A{
    public void show(){
        System.out.println("this is parent class.");
    }
}

output:
this is parent class.
this is child class.
