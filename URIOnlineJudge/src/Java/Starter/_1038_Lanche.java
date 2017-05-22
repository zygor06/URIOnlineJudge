package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1038_Lanche {
	
	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		String[][] tabelaItens = {
				{"1", "Cachorro Quente", "4.00"},
				{"2", "X-Salada", "4.50"},
				{"3", "X-Bacon", "5.00"},
				{"4", "Torrada simples", "2.00"},
				{"5", "Refrigerante", "1.50"}
		};
		
		String valor = leitor.nextLine();
		String[] arValor = valor.split(" ");
		
		Integer codigo = Integer.parseInt(arValor[0]);
		Integer qnt = Integer.parseInt(arValor[1]);
		
		double total = Double.parseDouble(tabelaItens[codigo - 1][2]) * qnt;
		
		System.out.printf("Total: R$ %.2f\n", total);
		
		leitor.close();
	}

}
