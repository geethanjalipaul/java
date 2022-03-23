
import java.util.*;
public class circle
{
        public static void main(String args[])
        {
	Double r,area,perimeter;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
     	r=input.nextDouble();
	area=Math.PI*r*r;
	perimeter=2*Math.PI*r;
        System.out.println();
        System.out.println("Area of circle="+area);
        System.out.println("Perimeter of circle="+perimeter);
        }
}