package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Maior1013 {

	public static void main(String[] args) throws IOException{
	
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		
		String s = leitor.nextLine();
		String[] as = s.split(" ");
		
		Integer a = Integer.parseInt(as[0]);
		Integer b = Integer.parseInt(as[1]);
		Integer c = Integer.parseInt(as[2]);
		
		int maiorAB = (a + b + (Math.abs(a - b)))/2;
		int maiorC = (maiorAB + c + (Math.abs(maiorAB - c)))/2;
		
		System.out.printf("%d eh o maior\n", maiorC);		

		leitor.close();
	}

}
