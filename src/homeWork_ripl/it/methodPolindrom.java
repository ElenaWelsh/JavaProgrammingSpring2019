package homeWork_ripl.it;

public class methodPolindrom {
	public static boolean isPalindrome(String check) {
		String checked = "";
		check = check.replaceAll(" ", "");
		for (int i = check.length() - 1; i >= 0; i--) {
			checked += check.charAt(i);

		}
		if (check.equalsIgnoreCase(checked)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("Nurses run"));
	}
}
