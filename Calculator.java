import java.util.*;
class Calculator
{
 public static void main(String[]args)
 {
   int a,b,c,ch;
   Scanner s1=new Scanner(System.in);
   System.out .println("enter two numbers");
a=s1.nextInt();
b=s1.nextInt();
System.out.println("1.add");
System.out.println("2.sub");
System.out.println("3.multiplication");
System.out.println("4.divisition");
System.out.println("enter your choice");
ch=s1.nextInt();
switch(ch)
{
case 1:c=a+b;
System.out.println("sum of two numbers is:"+c);
break;
case 2:c=a-b;
System.out.println("difference between two numbers is:"+c);
break;
case 3:c=a*b;
System.out.println("product of two numbers"+c);
break;
case 4:c=a/b;
System.out.println("quatient of two numbers is:"+c);
break;
default:System.out.println("enter a valid choice");
}
}
}






