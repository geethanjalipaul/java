import java.util.*;
class shapes1
{
void area(float x)
{
System.out.println("The area of square is:"+x*x);
}
void area(float x,float y)
{
System.out.println("The area of rectangle is:"+x*y);
}
void area(double x)
{
double z=3.14*x*x;
System.out.println("The area of circle is:"+z);
}
}
public class shapes
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
shapes1 obj1=new shapes();
System.out.println("Enter the length:");
float a=obj.nextFloat();
System.out.println("Enter the breadth:");
float b=obj.nextFloat();
System.out.println("Enter the radius:");
double r=obj.nextDouble();
obj1.area(a);
obj1.area(a,b);
obj1.area(r);
}
}