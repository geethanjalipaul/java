import java.util.*;
public class mapinterface {
	public static void main(String args[])
	{
		
		Map<String,Integer> map = new HashMap<>();

		 map.put("orange", 10);
        map.put("onion", 30);
        map.put("apples", 20);
System.out.println("Original Map:");
for (Map.Entry<String, Integer> e : map.entrySet())
  
            System.out.println(e.getKey() + " "
                               + e.getValue());
map.remove("onion");
System.out.println("map after removing onion:");
for (Map.Entry<String, Integer> e : map.entrySet())
  
            System.out.println(e.getKey() + " "
                               + e.getValue());
map.replace("apples",300);
System.out.println("Original Map:");
for (Map.Entry<String, Integer> e : map.entrySet())
  
            System.out.println(e.getKey() + " "
                               + e.getValue());
}
}