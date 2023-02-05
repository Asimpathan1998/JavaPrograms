package tutorial;

class StudentSort {

	static void rollNo(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	void print(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
			System.out.println();
		}
	}
}

public class ReverseArr {

	public static void main(String[] args) {

		StudentSort ss = new StudentSort();
		int arr[] = { 18, 45, 94, 39, 78, 15, 28 };
		StudentSort.rollNo(arr);
		System.out.println("Sorted array: ");
		ss.print(arr);

	}

}
