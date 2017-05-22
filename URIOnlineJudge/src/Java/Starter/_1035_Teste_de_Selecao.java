package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1035_Teste_de_Selecao {
	
	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		String valores = leitor.nextLine();
		String[] arValores = valores.split(" ");
		
		Integer a = Integer.parseInt(arValores[0]);
		Integer b = Integer.parseInt(arValores[1]);
		Integer c = Integer.parseInt(arValores[2]);
		Integer d = Integer.parseInt(arValores[3]);
		
		if(b > c && d > a && (c + d) > (a + b) && c >= 0 && d >= 0 && a % 2 == 0){			
			System.out.printf("Valores aceitos\n");
		}else{
			System.out.printf("Valores nao aceitos\n");
		}
		
		leitor.close();
	}

}
