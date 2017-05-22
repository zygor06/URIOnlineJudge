package Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos1015 {

	public static void main(String[] args) throws IOException{
	
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		
		String linha1 = leitor.nextLine();
		String linha2 = leitor.nextLine();
		
		String[] arrayLinha1 = linha1.split(" ");
		String[] arrayLinha2 = linha2.split(" ");
		
		Double x1 = Double.parseDouble(arrayLinha1[0]);
		Double y1 = Double.parseDouble(arrayLinha1[1]);
		Double x2 = Double.parseDouble(arrayLinha2[0]);
		Double y2 = Double.parseDouble(arrayLinha2[1]);
		
		double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("%.4f\n", distancia);		

		leitor.close();
	}

}
