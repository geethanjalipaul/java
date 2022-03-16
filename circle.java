
import java.util.*;
public class circle
{
        public static void main(String args[])
        {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int r=input.nextInt();
	int area=Math.PI*r*r;
	int perimeter=2*Math.PI*r;
        System.out.println();
        System.out.println("Area of circle="+area);
        System.out.println("Perimeter of circle="+perimeter);
        }
}