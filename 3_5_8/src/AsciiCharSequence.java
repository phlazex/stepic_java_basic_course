public class AsciiCharSequence implements CharSequence {
	private final byte[] value;

	@Override
	public int length() {
		return this.value.length;
	}

	@Override
	public char charAt(int index) {
		return (char)this.value[index];
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return new AsciiCharSequence(java.util.Arrays.copyOfRange(this.value, start, end));
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();

		for (int i = 0; i < this.length(); i++) {
			string.append(this.charAt(i));
		}

		return string.toString();
	}

	public AsciiCharSequence(byte[] value) {
		this.value = value;
	}

	public static void main(String[] args) {
		byte[] example = {72, 101, 108, 108, 111, 33};

		AsciiCharSequence answer = new AsciiCharSequence(example);

		System.out.println("Последовательность - " + answer.toString());//Hello!
		System.out.println("Размер её - " + answer.length());//6
		System.out.println("Символ под № 1 - " + answer.charAt(1));//e
		System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
		System.out.println(answer.toString());//Hello!
		example[0] = 74;
		System.out.println(answer.toString());//Jello!
	}
}
