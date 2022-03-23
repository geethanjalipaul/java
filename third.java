import java.util.*;
public class third
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Input the first number:");
        int x=input.nextInt();
        System.out.println("Input the second number:");
        int y=input.nextInt();
        System.out.println("Input the third number:");
        int z=input.nextInt();
        System.out.println("The result is:"+sumoftwo(x,y,z));
    }
    public static Boolean sumoftwo(int p, int q,int r)
    {
        return((p+q)==r||(r+q)==p||(r+p)==q);
    }
}