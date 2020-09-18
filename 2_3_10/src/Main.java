public class Main {
	/**
	 * Checks if given <code>text</code> is a palindrome.
	 *
	 * @param text any string
	 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
	 */
	public static boolean isPalindrome(String text) {
		text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		String newText = (new StringBuilder(text)).reverse().toString();

		return newText.equals(text);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("Madam, I'm Adam!"));
	}
}
