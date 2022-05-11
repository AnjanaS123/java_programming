class rect 
{  
int length;
int breadth;
rect()
{
length=10;
breadth=10;
}
rect(int a,int b)
{
length=a;
breadth=b;
}
rect(int a)
{
length=breadth=a;
}
void printData()
{
System.out.println("area is"+length*breadth);
}
}
class demo
{
public static void main(String[] args)
{
rect obj1=new rect();
rect obj2=new rect(10,2);
rect obj3=new rect(10);
obj1.printData();
obj2.printData();
obj3.printData();
}
}




