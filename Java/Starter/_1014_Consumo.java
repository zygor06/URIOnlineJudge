package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1014_Consumo {

	public static void main(String[] args) throws IOException{
	
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		
		int x = leitor.nextInt();
		double y = leitor.nextDouble();
		
		double consumo = x / y;
		
		System.out.printf("%.3f km/l\n", consumo);		

		leitor.close();
	}

}
