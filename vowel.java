import java.util.*;
public class vowel
{
public static void main(Strings args[])
{
Scanner in=new Scanner(System.in);
String str=in.nextline();
System.out.print("Number of vowels in the string"+Countvowels(str));
}
public static int Countvowels( string str)
{
int Count=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
count++;
}
}
return Count;
}
}