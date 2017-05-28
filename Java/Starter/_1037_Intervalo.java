package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1037_Intervalo {
	
	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double valor = leitor.nextDouble();
		
		if(valor >= 0.0 && valor <= 25){
			System.out.printf("Intervalo [0,25]\n");
		}else if(valor > 25.0 && valor <= 50){
			System.out.printf("Intervalo (25,50]\n");
		}else if(valor > 50.0 && valor <= 75){
			System.out.printf("Intervalo (50,75]\n");
		}else if(valor > 75.0 && valor <= 100){
			System.out.printf("Intervalo (75,100]\n");
		}else{
			System.out.printf("Fora de intervalo\n");
		}
		
		leitor.close();
	}

}
