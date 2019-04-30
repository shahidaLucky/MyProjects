package array;

public class ArrayPractice {

	public static void main(String[] args) {

		int[] values = new int[] { 1, 2, 3, 4 };

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		for (int idx : values) {
			System.out.println(idx);
		}
	}

}
