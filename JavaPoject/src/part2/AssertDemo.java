package part2;

public class AssertDemo {
	public static void main(String[] args) {
		int[] array = { 20, 91, -6, 16, 0, 7, 51, 42, 3, 1 };
		sort(array);
		for (int element : array)
			System.out.printf("%d ", element);
		System.out.println();
	}

	private static boolean isSorted(int[] x) {
		for (int i = 0; i < x.length - 1; i++)
			if (x[i] > x[i + 1])
				return false;
		return true;
	}

	private static void sort(int[] x) {
		int j, a;
		// For all integer values except the leftmost value ...
		for (int i = 1; i < x.length; i++) {
			a = x[i];
			j = i;
			while (j > 0 && x[j - 1] > a) {
				x[j] = x[j - 1];
				j--;
			}
			x[j] = a;
		}

		assert isSorted(x) : "array not sorted";
	}
}