package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel1017{

	public static void main(String[] args) throws IOException{
	
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);

		double tempoGasto = leitor.nextDouble();
		double velocidadeMedia = leitor.nextDouble();

		double qntGasolina = (tempoGasto * velocidadeMedia) / 12;
		
		System.out.printf("%.3f\n", qntGasolina);		

		leitor.close();
	}

}
