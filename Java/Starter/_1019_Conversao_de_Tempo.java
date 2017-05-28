package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1019_Conversao_de_Tempo {

	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int horas = 0, minutos = 0, segundos = 0;
		
		int tempo = leitor.nextInt();
		
		while(tempo >= 3600){
			tempo -= 3600;
			horas++;
		}
		
		while(tempo >= 60 ){
			tempo -= 60;
			minutos++;
		}
		
		segundos = tempo;
		
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
	
		leitor.close();
	}

}
