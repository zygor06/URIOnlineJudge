package Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Distancia1016{

	public static void main(String[] args) throws IOException{
	
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);

		int dist = leitor.nextInt();
		
		dist *= 2;
		
		System.out.printf("%d minutos\n", dist);		

		leitor.close();
	}

}
