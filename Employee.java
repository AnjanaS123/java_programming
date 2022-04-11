class Employee
{
int r;
String n;
long ph;
String dg;
String dt;
void Employee(int record,String name,String desig,String dept,long phno)
{
r=record;
n=name;
dg=desig;
dt=dept;
ph=phno;
}
void display()
{
System.out.println(r+"\t\t\t"+n+"\t\t\t"+dg+"\t\t\t"+dt+"\t\t\t"+ph);
}
public static void main(String args[])
{
Employee obj1=new Employee();
Employee obj2=new Employee();
Employee obj3=new Employee();
obj1.Employee(001,"Riya","Manager","Sales",9999999999L);
obj2.Employee(002,"Angelina","Asst_Manager","Sales",999999000L);
obj3.Employee(003,"Alex","CEO","Sales",999000000L);
System.out.println("*************EMPLOYEE DETAILS********************");
System.out.println("\n\nNAME\t\tDESIGNATION\t\tDEPARTMENT\t\tPHONE NUMBER\n");
obj1.display();
obj2.display();
obj3.display();
}
}
