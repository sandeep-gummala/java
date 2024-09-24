import java.util.*;

abstract class Shape{
    public abstract void Area(double k);
    public static void main(String args[]){
        Shape circle=new Circle();
        Shape square=new Square();
        circle.Area(4);
        square.Area(6);
    }
}
  class Circle extends Shape{
     public void Area(double r){
         System.out.println("Area of Circle:"+Math.PI*r*r);
     }
}
  class Square extends Shape{
    public void Area(double a){
         System.out.println("Area of Square:"+a*a);
     }
}

output:
Area of Circle:50.26548245743669
Area of Square:36.0
