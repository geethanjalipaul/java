
import java.util.*;
public class hashset{
   public static void main(String args[]) {
      // create hash set 1
      HashSet <Integer>hs1 = new HashSet<Integer>();
      hs1.add(1);
      hs1.add(2);
      hs1.add(3);
      
      System.out.println("Elements in set 1 = "+hs1);
      // create hash set 2
      HashSet <Integer>hs2 = new HashSet<Integer>();
      hs2.add(3);
      hs2.add(2);
      hs2.add(1);
      
      System.out.println("Elements in set 2 = "+hs2);
      System.out.println("Are both the HashSet equal? "+hs1.equals(hs2));
   hs2.remove(2);
System.out.println("second hash set after removing an element:" +hs2);
System.out.println("hs1.equals(hs2)?"+hs1.equals(hs2));

}
}