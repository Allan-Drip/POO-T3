package br.edu.principal;
import java.util.*;
public class Principal {

		public static void main(String[] args) {
			
		System.out.println("-------------------------------");
		System.out.println("Encontre a área de um triângulo");
		System.out.println("-------------------------------\n");
	
		double base = 0.0;
		double altura = 0.0;
		double area = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		while (base <= 0) {
			System.out.println("Digite a base do triângulo: ");
			base = sc.nextDouble();
		}
		while (altura <= 0) {
			System.out.println("Digite a altura do triângulo: ");
			altura = sc.nextDouble();
		}

		System.out.println(" ");
		area = (base * altura)/2;
		System.out.println("A área do triângulo é: "+area);
}
}
		
		