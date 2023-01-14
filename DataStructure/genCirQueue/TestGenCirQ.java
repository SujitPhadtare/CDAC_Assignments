package genCirQueue;

public class TestGenCirQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenCirQ<String> genQ = new GenCirQ<>();
		
//		genQ.dequeue();
		genQ.enqueue("sujit");
		genQ.enqueue("varad");
		genQ.enqueue("shikha");
		genQ.enqueue("rohan");
		genQ.enqueue("suraj");
		
		while(!genQ.isEmpty()) {
			genQ.dequeue();
		}

	}

}
