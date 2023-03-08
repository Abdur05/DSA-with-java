import java.util.*;
class DataEx
{
Scanner sc=new Scanner(System.in);
int top;
int n=10;
int a[]=new int[n];
void push()
{
 if(top==n-1)
  { 
   System.out.print("Overflow");
  }
  else{
   System.out.print("Enter the value");
   int i=sc.nextInt();
   top+=1;
   a[top]=i;
   System.out.print("Item Inserted");
  }
}
void pop()
{
if(top==-1)
 {
   System.out.print("Underflow"); 
 }
else{
   top=top-1;
System.out.print("Item deleted");
 }
}
void display()
{
  System.out.print("Item are :");
  for(int i=top;i>=0;i--)
  {
     System.out.print(a[i]);
  }
}
}
class StackArray
{
public static void main(String args[])
{

DataEx s=new DataEx();
Scanner sc=new Scanner(System.in);
int l;
do{
System.out.println("Enter your choice");
System.out.println("Press 1 to push");
System.out.println("Press 2 to pop");
System.out.println("Press 3 to display");
int ch=sc.nextInt();

switch(ch)
{
case 1:
  {s.push();break;}
case 2:
  {s.pop();break;}
case 3:
  {s.display();break;}
default:
  System.out.println("Wrong choice");
}
l=sc.nextInt();
}while(l==0);
}
}