package by.training.simplestapp.main;

public class Int123 {

	public static void main(String[] args) {

		int x1 = 100;
		int x2 = 300;
		int x3 = 400;

		int min = Math.min(Math.min(x1, x2), x3);
		int max = Math.max(Math.max(x1, x2), x3);

		int sum = min + max;

		System.out.println("sum=" + sum);

	}

}
