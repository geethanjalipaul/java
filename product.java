
import java.util.*;
public class product
{
        public static void main(String args[])
        {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=input.nextInt();
        System.out.println("Enter the second number:");
        int num2=input.nextInt();
        int product=num1*num2;
        System.out.println();
        System.out.println("product="+product);
        }
}