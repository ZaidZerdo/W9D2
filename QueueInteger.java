package queue;

public class QueueInteger {	
	private Node start;
	private Node finish;
	
	public QueueInteger() {
		start = null;
		finish = null;
	}
	
	public boolean add(Integer value) {
		Node n = new Node(value);
		
		if (start == null) {
			start = n;
			finish = n;
		} else if (start == finish) {
			n.prev = start;
			finish = n;
			start.next = n;
		} else {
			finish.next = n;
			n.prev = finish;
			finish = n;			
		}
		return true;
	}
	
	public Integer poll() {
		try {
			Integer tmp = start.value;
			start = start.next;
			start.prev = null;
			return tmp;
		} catch (NullPointerException ex) {
			return null;
		}
	}
	
	public Integer peek() {
		if (start == null) {
			return null;
		}
		
		return start.value;
	}
	
	public Integer peekLast() {
		if (finish == null) {
			return null;
		}
		
		return finish.value;
	}
	
	private class Node {
		Integer value;
		Node prev;
		Node next;
		
		public Node(Integer value) {
			this.value = value;
		}
	}
}
