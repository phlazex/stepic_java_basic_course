import java.util.function.DoubleUnaryOperator;

public class Main {
	public static double integrate(DoubleUnaryOperator f, double a, double b) {
		double result = 0, h = 10E-6;

		for (int i = 1, n = (int)((b - a) / h); i <= n; i++) {
			result += f.applyAsDouble(a + h * (i - 1));
		}

		result *= h;

		return result;
	}

	public static void main(String[] args) {
		System.out.println(integrate(x -> 1, 0, 10));//10.0
		System.out.println(integrate(x -> x + 2, 0, 10));//70.0
		System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
	}
}