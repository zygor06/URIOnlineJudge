package Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Cedulas1018 {

	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		
		int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
		
		if(n < 0 || n > 1000000){
			throw new IOException("Numero fora dos limites. N = (0 < N < 1000000).");	
		}

		
		leitor.close();
	}

}
