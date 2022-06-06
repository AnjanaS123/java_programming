import java.util.*;
class Area1
{
void CalculateArea1(int s)
{
System.out.println("Area of the square :"+s*s+"sq.units");
}
void  CalculateArea1(float l,float b)
{
System.out.println("Area of rectangle:" +l*b+"Sq.units");
}
void CalculateArea1(double r)
{
double area =3.14*r*r;
System.out.println("Area of circle:"+area+"sq.units");
}
public static void main(String args[])
{
int s;
float l,b;
double r;
Area1 obj=new Area1();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of the square");
s=sc.nextInt();
System.out.println("Enter the length and breadth of the rectangle");
l=sc.nextFloat();
b=sc.nextFloat();
System.out.println("Enter the radius of the circle");
r=sc.nextDouble();
obj.CalculateArea1(s);
obj.CalculateArea1(l,b);
obj.CalculateArea1(r);
}
}