import java.util.*;
class Circle
{
 double area;
Circle(double r)
{
 area=3.14*r*r;
}
}
class Areaof
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the radius of the circle");
double radius=s.nextDouble();
Circle a=new Circle(radius);
System.out.println("area of circle  is"+a.area);
}
}