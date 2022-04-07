import java.util.*;
class cpu
{
double price;
class processor
{
double cores;
String manufacturer;
double getCache() 
{
return 4.3;
}
}
protected class RAM
{
double memory ;
String manufacturer;
double getClockSpeed() 
{
return 5.5;
}
}
}
public class CPUDetails 
{
public static void main(String args[]) 
{
cpu cpu=new cpu();
cpu.processor processor= cpu.new processor();
cpu.RAM ram=cpu.new RAM();
System.out.println("Processor Cache= "+processor.getCache());
System.out.println("Ram Clockspeed="+ram.getClockSpeed());
}
}