import java.util.*;
public class fibo
{
public static void main(String args[])
{
int i=0;
int max=10;
int prev=0;
int next=1;
System.out.println("Fibonacci Series of"+max+"numbers:");
while(i<=max)
{
System.out.println(prev+" ");
int sum=prev+next;
prev=next;
next=sum;
i++;
}
}
}