import java.util.*;
class MapInterfaces
{
    public static void main(String args[])
    {
        System.out.println("Adding Elements");
        Map<Integer, String> hm1 = new HashMap<>();
        Map<Integer, String> hm2= new HashMap<Integer, String>();
        hm1.put(1, "Adding 1");
        hm1.put(2, "Adding 2");
        hm1.put(3, "Adding 3");
        hm2.put(new Integer(1), "value 1");
hm2.put(new Integer(2), "value 2");
hm2.put(new Integer(3), "value 3");
System.out.println(hm1);
System.out.println(hm2);
System.out.println("Changing Elements");
Map<Integer, String> hm3= new HashMap<Integer, String>();
 hm3.put(new Integer(1), "maths");
 hm3.put(new Integer(2), "science");
 hm3.put(new Integer(3), "english");
 System.out.println("Initial Map " + hm3); 
 hm3.put(new Integer(2), "For"); 
 System.out.println("Updated Map " + hm3);
System.out.println("Removing Elements");
 Map<Integer, String> hm4= new HashMap<Integer, String>();
 hm4.put(new Integer(1), "social science");
 hm4.put(new Integer(2), "malayalam");
 hm4.put(new Integer(3), "psychology");
 hm4.put(new Integer(4), "statistics");
System.out.println(hm4);
 hm4.remove(new Integer(4));
 System.out.println(hm4);
}
}
