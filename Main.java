package queue;

public class Main {
	
	public static void main(String[] args) {
		QueueInteger q = new QueueInteger();
		System.out.println(q.peek());
		System.out.println(q.add(2));
		System.out.println(q.add(5));
		System.out.println(q.add(7));
		System.out.println(q.peek());
		System.out.println(q.peekLast());
	}

}
