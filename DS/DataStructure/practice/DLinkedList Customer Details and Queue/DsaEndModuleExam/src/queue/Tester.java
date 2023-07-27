package queue;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.push(11);
		q.push(12);
		q.display();
		System.out.println();
		q.pop();
		q.display();
		q.search(12);
		q.update(12, 10);
		System.out.println();
		q.display();
	}

}
