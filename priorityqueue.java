import java .util.*;
public class priorityqueue{
public static void main(String args[])
{
 PriorityQueue<String> pq = new PriorityQueue<>();
pq.add("Welcome");
pq.add("have");
pq.add("your");
pq.add("seat");
System.out.println("original queue:"+pq);
pq.remove("your");
System.out.println("After remove "+pq);
System.out.println("poll method "+pq.poll());
System.out.println("Final queue "+pq);
System.out.println(pq.peek());
}
}