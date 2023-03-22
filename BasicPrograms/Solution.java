package basic;

class Solution {
	
	
	public static void main(String args[]) {
		System.out.println(isSubsequence("abc","acbc"));
	}	
	public static boolean isSubsequence(String s, String t) {
		int j = 0;
		for (int i = 0; i < t.length(); i++) {

			if (t.charAt(i) == s.charAt(j)) {
				j++;
			}
			if (j >= s.length()) {
				return true;
			}
		}
		System.out.println(j);
		return false;

	}
}
