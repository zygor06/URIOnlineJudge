package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1020_Idade_em_Dias {

	public static void main(String[] args) throws IOException{
			
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		
		
		int ano = 0, mes = 0, dia = 0;
		
		while(n >= 365){
			n -= 365;
			ano++;
		}
		
		while(n >= 30){
			n -= 30;
			mes++;
		}
		
		dia = n;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
		
		leitor.close();		
	}

}
