package ll2_full;

public class SLLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL mySLL = new SLL();
		mySLL.insertAtBeginning(20); 
		mySLL.display();
		System.out.println(mySLL.isPalindrome());
		mySLL.insertAtBeginning(10); 
		mySLL.display();
		System.out.println(mySLL.isPalindrome());
		mySLL.insertAtEnd(30);
		mySLL.display();
//		mySLL.insertAtEnd(30);
		mySLL.display();
		mySLL.insertAtEnd(20);
		mySLL.display();
		mySLL.insertAtEnd(10);
		mySLL.display();
		
		System.out.println(mySLL.isPalindrome());

		/*
		 * System.out.println(mySLL.listLength());
		 * 
		 * //mySLL.display(); System.out.println("------ Old ----------\n");
		 * mySLL.display(); System.out.println("\n------ New ----------");
		 * mySLL.insertAtPosition(2, 40); mySLL.display(); mySLL.insertAtPosition(1,
		 * 50); mySLL.display(); // mySLL.insertAtPosition(10, 50); mySLL.display();
		 * mySLL.removeFromEnd(); mySLL.display(); mySLL.displayRev(); mySLL.display();
		 * mySLL.displayRevRec(mySLL.getHead()); System.out.println("------");
		 * //mySLL.display(); mySLL.removeFromPos(1); mySLL.display();
		 * 
		 * System.out.println("\n--------Rec----------\n"); mySLL.display();
		 * mySLL.displayRevRec(mySLL.getHead()); System.out.println(); mySLL.display();
		 */
		
		
	}

}
