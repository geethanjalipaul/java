import java.util.*;
public class digits
{
        public static void main(String args[])
        {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        {
		int sum=0;
		while(num!=0)
		{
		sum+=num%10;
		num/=10;
		}
		return sum;
	}
        System.out.println();
        System.out.println("SUM OF DIGITS="+sum);
        }
}