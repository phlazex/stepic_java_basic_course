public final class ComplexNumber {
	private final double re;
	private final double im;

	public ComplexNumber(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public double getIm() {
		return im;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ComplexNumber that = (ComplexNumber) o;
		return Double.compare(that.getRe(), getRe()) == 0 &&
				Double.compare(that.getIm(), getIm()) == 0;
	}

	@Override
	public int hashCode() {
		return Double.hashCode(getIm() + getRe());
	}

	public static void main(String[] args) {
		ComplexNumber a = new ComplexNumber(1, 1);
		ComplexNumber b = new ComplexNumber(1, 1);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}
