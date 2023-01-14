package parenthesis;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashParen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		hm.put('{', '}');
		hm.put('[', ']');
		hm.put('(', ')');
		hm.put('<', '>');

//		System.out.println(" hm : " + hm);
		try (Scanner sc = new Scanner(System.in)) {

			int i = 0;
			boolean flag = true;
			Character strChar = null;

//		String str = "{{}}";
			System.out.println("Enter paranthesis sequence : ");
			String str = sc.next();

			Stack<Character> pStack = new Stack<>(10);
			for (i = 0; i < str.length(); i++) {
				strChar = str.charAt(i);
				if (hm.containsKey(strChar)) {
					pStack.push(strChar);
				} else {
					if (pStack.isEmpty()) {
						flag = false;
						break;
					}
					Character cpop = pStack.pop();
					if (!hm.get(cpop).equals(strChar)) {
						flag = false;
						break;
					}
				}
			}

			System.out.println(str);
			// flag true and stack empty check
			if (!flag)
				System.out.println("Invalid Parenthesis '" + strChar + "' at index " + i);
			else if (!pStack.isEmpty())
				System.out.println("Invalid Parenthesis " + pStack);
			else
				System.out.println("Valid Parenthesis Sequence");
		}
	}
}
