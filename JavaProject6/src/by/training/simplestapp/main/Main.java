package by.training.simplestapp.main;

public class Main {

	public static void main(String[] args){
		
		double a,b,c, rez;
		a = 4;
		b = 6;
		c = 88;
		
		rez = (b+Math.sqrt(b*b+4*a*c))/(2*a)-(Math.pow(a,3)*c+Math.pow(b,-2));
		System.out.println("Результат - "+rez);
	}

}
