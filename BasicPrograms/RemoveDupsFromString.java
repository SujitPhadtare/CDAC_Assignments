package basic;

public class RemoveDupsFromString {
	public static boolean[] map = new boolean[26];

	public static void main(String[] args) {
		String str = "abbacdddcd";

		removeDups(str, 0, "");

	}

	private static void removeDups(String str, int index, String newString) {
		if (index == str.length()) {
			System.out.println(newString);
			return;
		}
		char mapChar = str.charAt(index);
		if (!map[mapChar - 'a']) {
			newString += mapChar;
			map[mapChar - 'a'] = true;

		}
		removeDups(str, index + 1, newString);
	}

}
