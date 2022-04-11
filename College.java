import java.util.*;
class College
{
class staff
{
String name;
int age;
long ph_no;
int salary;
public void getData(String n,int a,long ph,int s)
{
name=n;
age=a;
ph_no=ph;
salary=s;
}
public void display()
{
System.out.println("name"+name);
System.out.println("age"+age);
System.out.println("phone number"+ph_no);
System.out.println("salary"+salary);
}
}
static class student
{
String s_name;
int s_age;
long s_ph;
public void getData(String name,int age,long ph)
{
s_name=name;
s_age=age;
s_ph=ph;
}
public void display()
{
System.out.println("name"+s_name);
System.out.println("age"+s_age);
System.out.println("phone number"+s_ph);
}
}
public static void main(String[] args)
{
  College c1 = new College();
	College.staff sff=c1.new staff();
        
	College.student stu= new College.student();

        System.out.println("\nStaff Details ");
	sff.getData("Manu",34,342556,4566);
        sff.display();
 	System.out.println("\n");
	System.out.println("Student Details ");
	stu.getData("Aswathy",4,6767777);
        stu.display();
    
}
}







