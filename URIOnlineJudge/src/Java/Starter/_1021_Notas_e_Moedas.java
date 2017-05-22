package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1021_Notas_e_Moedas {

	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double valor = leitor.nextDouble();
		
		int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, m100 = 0, m50 = 0, m25 = 0, m10 = 0, m5 = 0, m1 = 0;
		
		if(valor < 0 || valor > 1_000_000.00){
			System.out.printf("Erro\n");
		}else{
			while(valor >= 100.00){
				valor -= 100.00;
				n100++;
			}
			
			while(valor >= 50.00){
				valor -= 50.00;
				n50++;
			}
			
			while(valor >= 20.00){
				valor -= 20.00;
				n20++;
			}
			
			while(valor >= 10.00){
				valor -= 10.00;
				n10++;
			}
			
			while(valor >= 5.00){
				valor -= 5.00;
				n5++;
			}
			
			while(valor >= 2.00){
				valor -= 2.00;
				n2++;
			}
			
			while(valor >= 1.00){
				valor -= 1.00;
				m100++;
			}
			
			while(valor >= 0.50){
				valor -= 0.50;
				m50++;
			}
			
			while(valor >= 0.25){
				valor -= 0.25;
				m25++;
			}
			
			while(valor >= 0.10){
				valor -= 0.10;
				m10++;
			}
			
			while(valor >= 0.05){
				valor -= 0.05;
				m5++;
			}
			
			while(valor >= 0.01){
				valor -= 0.01;
				m1++;
			}
			
			System.out.printf(
						"NOTAS:\n"
					+ 	"%d nota(s) de R$ 100.00\n"
					+ 	"%d nota(s) de R$ 50.00\n"
					+ 	"%d nota(s) de R$ 20.00\n"
					+ 	"%d nota(s) de R$ 10.00\n"
					+ 	"%d nota(s) de R$ 5.00\n"
					+ 	"%d nota(s) de R$ 2.00\n"
					+ 	"MOEDAS:\n"
					+ 	"%d moeda(s) de R$ 1.00\n"
					+ 	"%d moeda(s) de R$ 0.50\n"
					+ 	"%d moeda(s) de R$ 0.25\n"
					+ 	"%d moeda(s) de R$ 0.10\n"
					+ 	"%d moeda(s) de R$ 0.05\n"
					+ 	"%d moeda(s) de R$ 0.01\n", 
					n100, n50, n20, n10, n5, n2, m100, m50, m25, m10, m5, m1);
		}
		
		
	
		leitor.close();
	}

}
