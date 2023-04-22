package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		System.out.println("******************************************************************************************");		
		System.out.println("O preço final de uma carga com base em seus impostos, valor de seguro e meio de transporte");
		System.out.println("******************************************************************************************\n");		

		double preco = 0;
		int origem = 0;
		String meio_tr = null;
		String carga = null;
		double imposto = 0;
		int valor_transp = 0;
		double seguro = 0;
		double preco_final = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do preço da carga: ");
		preco = sc.nextDouble();
		System.out.println("Digite o país de origem da carga (1-EUA; 2- México; 3- outros): ");
		origem = sc.nextInt();
		System.out.println("Digite o meio de transporte da carga (T-terrestre; F-fluvial; A-aéreo): ");
		meio_tr = sc.next();
		System.out.println("Digite se a carga é perigosa ou não (S-Sim; N-Não): ");
	    carga = sc.next();
	    
		if (preco <= 100) {
			imposto = preco * 5 /100;
		}else {
			imposto = preco * 10 /100;
		}
		
		if (carga.equals("S")) {
			if (origem == 1) {
				valor_transp = 50;
			}
			if (origem == 2) {
				valor_transp = 35;
			}
			if (origem == 3) {
				valor_transp = 24;
			}		
		}
		if (carga.equals("N")) {
			if (origem == 1) {
				valor_transp = 12;
			}
			if (origem == 2) {
				valor_transp = 35;
			}
			if (origem == 3) {
				valor_transp = 60;
			}
		}
		
		if ((origem == 2) || (meio_tr.equals("A"))) {
			seguro = preco /2;
		}else {
			seguro = 0;
		}
		
		preco_final = preco + imposto + valor_transp + seguro;
		
		
		System.out.println("O preço final é: "+preco_final);
		System.out.println("O preço do transporte é: "+valor_transp);
		System.out.println("O preço do seguro é: "+seguro);
		System.out.println("O preço do imposto é: "+imposto);


	}

}
