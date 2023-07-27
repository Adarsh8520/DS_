package dll;

public class DoublyLinkedList {
	static class Node {
		private Customer data;
		private Node next;
		private Node prev;

		public Node() {
			// TODO Auto-generated constructor stub
			next = null;
			prev = null;
		}

		public Node(Customer value) {
			// TODO Auto-generated constructor stub
			this.data = value;
			next = null;
			prev = null;
		}
	}

	int count = 1;
	private Node head;

	// add at first
	void addFirst(Customer value) {
		Node nn = new Node(value);
		if (head == null) {
			head = nn;
			return;
		} else {
			nn.next = head;
			head.prev = nn;
			head = nn;
		}
		count++;
	}

	void addLast(Customer value) {
		Node nn = new Node(value);
		if (head == null) {
			head = nn;
			return;
		} else {
			Node temp = head;
			while (temp.next != null) {
				// traverse till the last Node
				temp = temp.next;
			}
			nn.prev = temp;
			temp.next = nn;
		}
		count++;
	}

	void addAtPosition(Customer value, int pos) {
		Node nn = new Node(value);
		if (head == null || pos <= 1) {
			head = nn;
			return;
		} else {
			Node temp = null;
			Node trav = head;
			for (int i = 0; i < pos; i++) {
				temp = trav;
				trav = trav.next;
			}
			nn.next = trav;
			nn.prev = temp;
			trav.prev = nn;
			temp.next = nn;
		}
		count++;
	}

	void display() {
		if (head == null) {
			System.out.println("list is Empty");
			return;
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	int length() {
		return count;
	}

	void deleteLast() {
		if (head == null) {
			System.out.println("list is Empty");
			return;
		} else {
			Node temp = null;
			Node trav = head;
			while (trav.next != null) {
				// traverse till the last Node
				temp = trav;
				trav = trav.next;
			}
			temp.next = null;
		}
		count--;
	}

	void deleteFirst() {
		if (head == null) {
			System.out.println("list is Empty");
			return;
		} else {
			head = head.next;
		}
		count--;
	}

	void deleteAtposition(int pos) {
		if (head == null || pos <= 1) {
			System.out.println("list is empty");
			return;
		} else {
			Node temp = null;
			Node trav = head;
			for (int i = 0; i < pos - 1; i++) {
				temp = trav;
				trav = trav.next;
			}
			if (trav.next == null) {
				temp.next = null;
			} else {
				Node temp2 = trav.next;
				temp2.prev = temp;
				temp.next = temp2;
			}
		}
		count--;
	}

	void search(String name) {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty");
			return;
		} else {
			while (temp != null) {
				if (temp.data.getName().equals(name)) {
					System.out.println("element found \n" + temp.data);
					break;
				} else {
					temp = temp.next;
				}
			}
		}

	}
	void sortreverse() {
		if (head == null) {
			System.out.println("list is Empty");
			return;
		} else {
			Node temp = head;
			while (temp.next!= null) {
				temp = temp.next;
			}
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.prev;
			}
		}
		
	}
	void sort() {
		// Node temp=null;
		Node swap = null;
		Node j = null;
		if (head == null) {
			System.out.println("list is empty");
			return;
		} else {
			Node i = head;
			// temp=trav;
		//	for (Node i = trav; i != null; i = i.next) {
				if (i.data.getId() > i.next.data.getId()) {
					swap = i;
					i = j;
					j = swap;
System.out.println(j.data);
				}
			}
		}
//	}
}
