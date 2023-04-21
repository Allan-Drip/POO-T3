package br.edu.principal;
import java.util.*;
public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("====================================================================");
		System.out.println("Quantas vezes números digitados aparecem em determinados intervalos.");
		System.out.println("====================================================================\n");

		Scanner sc = new Scanner(System.in);
		
		double num = 0;
		int int1, int2, int3, int4;
		int1 = 0;
		int2 = 0;
		int3 = 0;
		int4 = 0;

		System.out.println(" -> Para terminar o loop digite um número negativo. <-\n");
		System.out.println("Digite um número positivo: ");
		
		num = sc.nextDouble();
		while (num >= 0 ) {
			if (num >= 0 && num <= 25) {
				int1 = int1 + 1;
			}
			if (num >= 26 && num <= 50) {
				int2 = int2 + 1;
			}
			if (num >= 51 && num <= 75) {
				int3 = int3 + 1;
			}
			if (num >= 76 && num <= 100) {
				int4 = int4 + 1;
			}
			if (num < 0) {
				break;
			}
			System.out.print("Digite um número positivo: ");
			num = sc.nextDouble();
		}
		System.out.println(" ");
		System.out.println("A quantidade de números no intervalo 1 [0 - 25] é: "+int1);
		System.out.println("A quantidade de números no intervalo 2 [26 - 50] é: "+int2);
		System.out.println("A quantidade de números no intervalo 3 [51 - 75] é: "+int3);
		System.out.println("A quantidade de números no intervalo 4 [76 - 100] é: "+int4);
}

}