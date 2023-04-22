package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
        System.out.println("*****************************************************************************************");
        System.out.println("Quantos divisores m possui ou a soma dos números de 1 até m, dependendo se é par ou ímpar");
        System.out.println("*****************************************************************************************\n");

		
		        int m = 0;
		        int i = 1;
		        int divisores = 0;
		        int soma = 0;

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Digite o valor de m: ");
		        m = sc.nextInt();

		        while (m > 0) {
		            divisores = 0;

		            if (m % 2 == 0) {
		                for (i = 1; i <= m; i++) {
		                    if (m % i == 0) {
		                        divisores = divisores + 1;
		                    }
		                }
		                System.out.println("A quantidade de divisores que " + m + " possui é: " + divisores);
		            } else {
		      
		                for (i = 1; i <= m; i++) {
		                    soma = soma + i;
		                }
		                System.out.println("A soma de 1 até " + m + " é: " + soma);
		            }

		            System.out.println("  ");
		            System.out.println("Digite o valor de m: ");
		            m = sc.nextInt();
		        }
		    }
		}
