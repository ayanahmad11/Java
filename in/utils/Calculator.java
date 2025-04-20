package in.utils;
import java.lang.Math;
import in.geometry.Circel;
import in.geometry.Rectangle;

public class Calculator {
      
    public static void main(String[] args) {
        Circel cir = new Circel(5.5);
        Rectangle rect = new Rectangle(10, 5);

        double circArea = Math.PI * Math.pow(cir.radius,2);
        double rectArea = rect.breadth * rect.length;

        System.out.printf("Area of circle is :%f     , Area of the rectangle is: %s",circArea,rectArea);
    }
}
