public class Main {
	/**
	 * Checks if given <code>value</code> is a power of two.
	 *
	 * @param value any number
	 * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
	 */
	public static boolean isPowerOfTwo(int value) {
		return Integer.lowestOneBit(Math.abs(value) >> Integer.numberOfTrailingZeros(Math.abs(value))) == Integer.highestOneBit(Math.abs(value) >> Integer.numberOfTrailingZeros(Math.abs(value))) && (value != 0);
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(-2));
	}
}
