import java.util.Arrays;

public class Main {
	/**
	 * Merges two given sorted arrays into one
	 *
	 * @param a1 first sorted array
	 * @param a2 second sorted array
	 * @return new array containing all elements from a1 and a2, sorted
	 */
	public static int[] mergeArrays(int[] a1, int[] a2) {
		int[] a = new int[a1.length + a2.length];
		int ptr1 = 0, ptr2 = 0;

		for (int i = 0; i < a.length; i++) {
			if (ptr1 < a1.length && ptr2 < a2.length) {
				if (a1[ptr1] < a2[ptr2]) {
					a[i] = a1[ptr1++];
				} else {
					a[i] = a2[ptr2++];
				}
			} else if (ptr1 < a1.length) {
				a[i] = a1[ptr1++];
			} else if (ptr2 < a2.length) {
				a[i] = a2[ptr2++];
			}
		}

		return a;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3})));
	}
}
