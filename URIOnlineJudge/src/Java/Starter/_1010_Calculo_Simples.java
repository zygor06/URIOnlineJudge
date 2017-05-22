package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1010_Calculo_Simples {

	public static void main(String[] args) throws IOException{
	
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		
		String l1 = leitor.nextLine();
		String l2 = leitor.nextLine();
		
		String[] a = l1.split(" ");
		String[] b = l2.split(" ");
		
		Integer peca1 = Integer.parseInt(a[0]);
		Integer qntPeca1 = Integer.parseInt(a[1]);
		Double valorPeca1 = Double.parseDouble(a[2]);
		
		Integer peca2 = Integer.parseInt(b[0]);
		Integer qntPeca2 = Integer.parseInt(b[1]);
		Double valorPeca2 = Double.parseDouble(b[2]);
		
		Double total = (qntPeca1 * valorPeca1) + (qntPeca2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);		

		leitor.close();
	}

}
