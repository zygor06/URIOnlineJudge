package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Area1012 {

	public static void main(String[] args) throws IOException{
	
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		
		String s = leitor.nextLine();
		String[] as = s.split(" ");
		
		Double a = Double.parseDouble(as[0]);
		Double b = Double.parseDouble(as[1]);
		Double c = Double.parseDouble(as[2]);
		double pi = 3.14159;
		
		double triangulo = (a * c) / 2;
		double circulo = (c * c) * pi;
		double trapezio = ((a + b) * c)/2;
		double quadrado = b * b;
		double retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);		

		leitor.close();
	}

}
