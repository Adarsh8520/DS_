package dll;

public class Tester {
	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		System.out.println("enter the first element");
		Customer c = new Customer(1, "kunal", "akurdi", 411033, 45544);
		Customer c1 = new Customer(2, "mayur", "akurdi", 411033, 45544);
		Customer c2 = new Customer(5, "Prakash", "Bamnod", 411033, 45544);
		Customer c3 = new Customer(3, "Vadana", "Bamnod", 411033, 45544);
		d.addFirst(c1);
		d.addFirst(c);
		d.addLast(c2);
		d.addAtPosition(c3, 2);
		d.display();
		System.out.println();
		d.deleteAtposition(2);
		//d.deleteLast();
	//	d.deleteFirst();
		d.display();
		System.out.println("Total nodes are "+d.length());
		System.out.println("search by name");
		d.search("kunal");
		System.out.println("reverse order");
		d.sortreverse();
//		System.out.println();
//		//d.display();
	}

}
