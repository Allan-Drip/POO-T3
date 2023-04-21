package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
        System.out.println("**************************************************************");
        System.out.println("Soma dos números encontrados em um dado intervalo entre m e n");
        System.out.println("**************************************************************\n");
		
		int m = 0;
		int n = 0;
		int soma = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor de m: ");
        m = sc.nextInt();
        System.out.print("Digite o valor de n: ");
        n = sc.nextInt();

        while (m <= n) {
            soma += m;
            m++;
            System.out.println("A soma dos números no intervalo [" +(m-1) + ", " + n + "] é igual a : " + soma);
            System.out.print("Digite o valor de m: ");
            m = sc.nextInt();
            System.out.print("Digite o valor de n: ");
            n = sc.nextInt();

        }
	}

}
