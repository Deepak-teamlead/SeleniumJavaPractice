package java_practice;
import java.util.PriorityQueue;
public class Queue {
public static void main(String[] args) {
PriorityQueue pq=new PriorityQueue();
pq.add(1);
pq.add(2);
pq.add(3);	
System.out.println("Elements in Priority Queue:"+pq);
System.out.println("gives header element, if empty returns Null: " +pq.peek());
System.out.println("returns and removes header element, if empty returns Null: " + pq.poll());
System.out.println("After Poll: "+ pq);
	

	}

}
