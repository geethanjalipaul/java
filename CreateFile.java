import java.io.*;
class CreateFile
{
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter("45.txt");
fw.write("a program to write to a file, then read from the file and display the contents on the console.");
fw.close();
System.out.println("\n File write done");
char c;
FileReader fr=new FileReader("45.txt");
BufferedReader in=new BufferedReader(fr);
String line=in.readLine();
while(line!=null)
{
System.out.println(line);
line=in.readLine();
}
in.close();
fr.close();
}
catch(IOException e)
{
System.out.println("There are some exception");
}
}
}