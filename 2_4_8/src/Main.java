import java.math.BigInteger;

public class Main {
	/**
	 * Calculates factorial of given <code>value</code>.
	 *
	 * @param value positive number
	 * @return factorial of <code>value</code>
	 */
	public static BigInteger factorial(int value) {
		BigInteger newValue = BigInteger.valueOf(1);

		while (value > 0) {
			newValue = newValue.multiply(BigInteger.valueOf(value));
			value--;
		}

		return newValue;
	}

	public static void main(String[] args) {
		System.out.println(factorial(1));
		System.out.println(factorial(3));
	}
}
