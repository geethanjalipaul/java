import java.util.*;
public class vowel
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String Str=in.nextLine();
System.out.print("Number of vowels in the string"+Countvowels(str));
}
public static int Countvowels( string str)
{
int Count=0;
for(int i=0;i<Str.Length();i++)
{
if(Str.charAt(i)=='a'||Str.charAt(i)=='e'||Str.charAt(i)=='i'||Str.charAt(i)=='o'||Str.charAt(i)=='u')
{
Count++;
}
}
return Count;
}
}