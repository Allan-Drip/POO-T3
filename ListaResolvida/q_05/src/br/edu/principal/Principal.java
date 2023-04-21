package br.edu.principal;
import java.util.Scanner;
public class Principal {

public static void main(String[] args) {
	
	   System.out.println("***********************************************************************************************************");
	   System.out.println("Programa que encontra o valor do número e da altura dos alunos mais alto e mais baixo entre 10 estudantes. ");
	   System.out.println("***********************************************************************************************************\n");

	

   int num = 0, altura = 0, num_maior = 0, num_menor = 0, altura_maior = 0, altura_menor = 0, temp = 0;

   Scanner sc = new Scanner (System.in);

   System.out.println("Digite o valor do número do aluno: ");
   num = sc.nextInt();

   System.out.println("Digite o valor da altura do aluno em centímetros: ");
   altura = sc.nextInt();

   num_maior = num;
   num_menor = num;
   altura_menor = altura;
   altura_maior = altura;

   for (int cont = 0; cont < 3; cont++){
	   	System.out.println("Digite o valor do número do aluno: ");
	   	num = sc.nextInt();
	   	System.out.println("Digite o valor da altura do aluno em centímetros: ");
	   	altura = sc.nextInt();

	   	if (altura > altura_maior) {
	   		altura_maior = altura;
	   		num_maior = num;
	   	}

	   	else if (altura < altura_menor){
	   		altura_menor = altura;
	   		num_menor = num;
	   	}
   }
 
   System.out.println("O aluno mais alto possui número: "+ num_maior + " com "+ altura_maior+ " centímetros de altura");
   System.out.println("O aluno mais baixo possui número: "+ num_menor+ " com "+ altura_menor + " centímetros de altura");

}

}
