package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1018_Cedulas {

	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int valor = leitor.nextInt();
		int n = valor;
		
		int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
		
		if(n < 0 || n > 1000000){
			throw new IOException("Presentation Error");	
		}
		
		while(n >= 100){
			n -= 100;
			n100++;
		}
		
		while(n >= 50){
			n -= 50;
			n50++;
		}
		
		while(n >= 20){
			n -= 20;
			n20++;
		}
		
		while(n >= 10){
			n -= 10;
			n10++;
		}
		
		while(n >= 5){
			n -= 5;
			n5++;
		}
		
		while(n >= 2){
			n -= 2;
			n2++;
		}
		
		while(n >= 1){
			n -= 1;
			n1++;
		}
		
		System.out.printf("%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n", valor, n100, n50, n20, n10, n5, n2,n1);
	
		leitor.close();
	}

}
