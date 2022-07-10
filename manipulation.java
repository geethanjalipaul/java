import java.util.*;
class manipulation
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.print("enter the first string:");
String str=obj.nextLine();
System.out.print("enter the second string:");
String str2=obj.nextLine();
System.out.println("Concatenation of string");
String str3=str.concat(str2);
System.out.println(str3);
System.out.println("Length of the first string: "+str.length());
System.out.println("character at position 4 in 1st string: "+str.charAt(3));
System.out.println("Index of character 'd' in  2nd string: "+str2.indexOf('d'));
System.out.println("Convert to LowerCase:"+str3.toLowerCase());
System.out.println("Convert to UpperCase:"+str3.toUpperCase());
}
}