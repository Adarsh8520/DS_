package queue;

public class Queue {
	static class Node{
		private int data;
		private Node next;
		public Node() {
			// TODO Auto-generated constructor stub
			next=null;
		}
		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.data=value;
			next=null;
		}
	}
	private Node head;
	private Node tail;
	int count=1;
	//add
	void push(int value) {
		Node nn=new Node(value);
		if(head==null) {
			head=nn;
			tail=nn;
			return;
		}else {
			tail.next=nn;
			tail=nn;	
		}
	}
	boolean isEmpty() {
		return head==null;
	}
	void display() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	void pop() {
		head=head.next;
		count--;
	}
	void search(int element) {
		Node temp=head;
		if(isEmpty()) {
			System.out.println("queue is empty");
			return;
		}else {
			while(temp!=null) {
				if(temp.data==element) {
					System.out.println("element found at index "+count);
					break;
				}else {
					temp=temp.next;
					count++;
				}
			}
		}
	}
	void update(int old,int value) {
		Node temp=head;
		if(isEmpty()) {
			System.out.println("queue is empty");
			return;
		}else {
			while(temp!=null) {
				if(temp.data==old) {
					System.out.println("old element is "+temp.data);
					temp.data=value;
					System.out.println("Updated element is "+temp.data);
					break;
				}else {
					temp=temp.next;
					
				}
			}
		}
		
	}
}
