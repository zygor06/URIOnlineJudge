package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1016_Distancia{

	public static void main(String[] args) throws IOException{
	
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);

		int dist = leitor.nextInt();
		
		dist *= 2;
		
		System.out.printf("%d minutos\n", dist);		

		leitor.close();
	}

}
