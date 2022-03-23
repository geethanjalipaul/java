import java.util.*;
public class multiplication
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        System.out.println();
        for(int i=0;i<11;i++)
        {
            System.out.println(num+"*"+i+"="+(i*num));
        }
    }
}