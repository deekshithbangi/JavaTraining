package com.bangi.test;
import com.bangi.model.Point;

public class PointTest {
public static void main(String[] args) {

    Point point1=new Point(); 
    System.out.println("Pont1:");
    
    System.out.println("("+point1.getX()+", "+point1.getY()+")"); 
    point1.setX(10);
    point1.setY(20);
    System.out.println("("+point1.getX()+", "+point1.getY()+")");
    
    Point point2=new Point(point1); // Copy Constructor i.e it copy the contents of the object point1 to point2
    System.out.println(point1.hashCode());
    System.out.println(point2.hashCode());
    
    point2=point1; // Copying the reference of point1 to point2 i.e both point1 and point2 will point to the same object
    
    System.out.println(point1.hashCode());
    System.out.println(point2.hashCode());
    
    System.out.println("Pont2:");
    System.out.println("("+point2.getX()+", "+point2.getY()+")");
    
    Point point3=new Point(25,50);
    System.out.println("Pont3:");
    System.out.println("("+point3.getX()+", "+point3.getY()+")");
    }
}
