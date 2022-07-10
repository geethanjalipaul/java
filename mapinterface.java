import java.util.*;
public class mapinterface {
	public static void main(String args[])
	{
		
		Map<String,Integer> map = new HashMap<>();

		 map.put("pencil", 10);
        map.put("pen", 30);
        map.put("eraser", 20);
System.out.println("Original Map:");
for (Map.Entry<String, Integer> e : map.entrySet())
  
            System.out.println(e.getKey() + " "
                               + e.getValue());
map.remove("pen");
System.out.println("map after removing pen:");
for (Map.Entry<String, Integer> e : map.entrySet())
  
            System.out.println(e.getKey() + " "
                               + e.getValue());
map.replace("pencil",50);
System.out.println("Original Map:");
for (Map.Entry<String, Integer> e : map.entrySet())
  
            System.out.println(e.getKey() + " "
                               + e.getValue());
}
}