package Java.Starter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1036_Formula_de_Bhaskara {
	
	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		String valores = leitor.nextLine();
		String[] arValores = valores.split(" ");
		
		Double a = Double.parseDouble(arValores[0]);
		Double b = Double.parseDouble(arValores[1]);
		Double c = Double.parseDouble(arValores[2]);
		
		double delta = (b * b) - 4 * a * c;
		
		if(delta < 0 || a == 0.0){
			System.out.printf("Impossivel calcular\n");
		}else{
			double r1 = (-b + Math.sqrt(delta)) / (2 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
		}
		
		leitor.close();
	}

}
