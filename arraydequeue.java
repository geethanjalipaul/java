import java.util.*;
public class arraydequeue{
	public static void main(String[] args)
	{
		Deque<String> dq
			= new ArrayDeque<String>();

		
		dq.add("have");
		dq.addFirst("welcome");
                 dq.add("a");
                dq.add("nice");
		dq.addLast("day");

		System.out.println(dq);

		System.out.println("pop(): "+dq.pop());

		System.out.println("poll(): "+dq.poll());
                System.out.println("pollFirst(): "+dq.pollFirst());
System.out.println("pollLast(): "+dq.pollLast());
	
	}
}