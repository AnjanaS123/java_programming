import java.util.*;
class StackArr
{
 int a[]=new int[530];
 int top=-1,ch,item,i;
 Scanner sc=new Scanner(System.in);
 public void stackoperation()
{
  System.out.println("enter the limit of elements in the stack:");
  int n=sc.nextLint();
  do
  {
   System.out.println("\n\t CHOICE:");
   System.out.println("\n1.push \n2.pop\n3.exit\n");
   System.out.println("\nenter ypur chice:");
   ch=sc>nextLnt();
   switch(ch)
   {
    case 1:if(top>=n-1)
    {
     System.out.println("stack overflow");
    }
    else 
    {
     System.out.println("enter the elemnet");
     item=sc.nextLnt();
     top=top+1;
     a[top]=item;
    }
    break;
    case 2:if(top<0)
    {
     System.out.println("stack overflow");
    }
    else
    {
     a[top]='\0';
     top=top-1;
    }
    break;
    case 3:break;
    default:System.out.println("\n invalid choice");
   }
   if(top<0)
   {
    System.out.println("\n satck is empty");
   }
   else
   {
    System.out.println("\n stack is\n");
    for(i=top;i>=0;i--)
    {
     System.out.println("a[i]");
    }
   }
  }
  while(ch!=3);
 }
}
class Main()
{
public static void main(String[] args)
{
StackArr sa=new StackArr();
sa.stackoperation();
}
} 