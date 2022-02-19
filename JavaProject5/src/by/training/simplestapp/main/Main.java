package by.training.simplestapp.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1221; 
		int[] mas = new int[4];//
		
		char[] chStr = new char[4];
		String str; 
		str = Integer.toString(x); 
		
		chStr = str.toCharArray(); 
		for(int i=0; i<chStr.length; i++) {
			mas[i] = Integer.parseInt(chStr[i]+"");
		}
		if((mas[0]+mas[1]) == (mas[2]+mas[3]))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

}
