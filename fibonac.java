import java.util.*;
public class fibonac
{
public static void main(String args[])
{
int prev=0;
int next=1;
Scanner input = new Scanner(System.in);
System.out.println("How many numbers you want in fibonacci series:");
int max=input.nextInt();
System.out.println("Fibonacci Series of"+max+"numbers:");
for(int i=1;i<=max;i++)
{
System.out.println(prev+" ");
int sum=prev+next;
prev=next;
next=sum;
}
}
}