package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1009_Salario_Com_Bonus {

	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		String nome = leitor.next();
		double salarioFixo = leitor.nextDouble();
		double vendas = leitor.nextDouble();
		double total = salarioFixo + (vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n", total);	

	}

}
