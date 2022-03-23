import java.util.*;
public class digit
{
    public static void main(String args[])
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the digit");
        long num=input.nextLong();
        System.out.println("The sum of the digits of "+num+" = "+digits(num));
    }
    public static int digits(long num)
    {
    int sum=0;
    while(num!=0)
    {
        sum+=num%10;
        num/=10;
    }
    return sum;
    }
}