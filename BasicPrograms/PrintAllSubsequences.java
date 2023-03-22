package basic;

public class PrintAllSubsequences {

	public static void main(String[] args) {
		String str = "aa";
		subsequences(str, 0, "");
	}

	private static void subsequences(String str, int i, String newString) {
		if (i == str.length()) {
			System.out.println(newString);
			return;
		}
		char curChar = str.charAt(i);
		// added
		subsequences(str, i + 1, newString + curChar);
		// not added

		subsequences(str, i + 1, newString);
	}

}
