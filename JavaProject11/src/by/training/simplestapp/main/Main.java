package by.training.simplestapp.main;

public class Main {

	public static void main(String[] args) {

		double x = 3.8, y = 3.9, z = -0.5;

		if (x < 0) {
			x = Math.pow(x, 4);
			System.out.println("new x =" + x);
		} else
			System.out.println("new x =" + Math.pow(x, 2));
		if (y < 0) {
			y = Math.pow(y, 4);
			System.out.println("new y =" + y);
		} else
			System.out.println("new y =" + Math.pow(y, 2));

		if (z < 0) {
			z = Math.pow(z, 4);
			System.out.println("new z =" + z);
		} else
			System.out.println("new z =" + Math.pow(z, 2));
	}

}

