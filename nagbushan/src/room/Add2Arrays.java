package room;

public class Add2Arrays {

	static void addTwoArrays(int[] a, int[] b) {

		int carry = 0;
		int[] res = new int[a.length];

		for (int i = a.length - 1; i >= 0; i--) {
			int sum = a[i] + b[i];
			res[i] = (sum % 10) + carry;//we get 1st value
			carry = sum / 10;//we get last value
		}

		for (int i : res) {
			System.out.print(i);
		}

	}

	public static void main(String[] args) {

		addTwoArrays(new int[] { 1, 2, 4 }, new int[] { 1, 5, 7 });

	}

}
