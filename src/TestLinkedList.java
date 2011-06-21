import java.util.LinkedList;


public class TestLinkedList {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.push("yes");
		ll.push("no");
		ll.push("third");
		System.out.println("ll="+ll);
		ll.pop();
		System.out.println("ll="+ll);
		ll.pop();
		ll.pop();
		System.out.println("empty="+ ll.isEmpty());
		ll.offer("damn1");
		ll.offer("damn2");
		ll.offer("damn3");
		System.out.println("ll="+ll);
		ll.poll();
		System.out.println("ll="+ll);
		ll.poll();
		ll.poll();
		System.out.println("ll="+ll);
	}

}
