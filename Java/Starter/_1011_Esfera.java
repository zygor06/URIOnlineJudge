package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1011_Esfera {

	public static void main(String[] args) throws IOException{
	
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		
		double raio = leitor.nextDouble();
		double pi = 3.14159;		
		double volume = (4.0 / 3) * pi * (raio * raio * raio);
		
		System.out.printf("VOLUME = %.3f", volume);		

		leitor.close();
	}

}
