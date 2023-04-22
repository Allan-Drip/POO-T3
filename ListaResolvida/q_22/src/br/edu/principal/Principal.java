package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------");
        System.out.println("Taxa de mortalidade de crianças em um determinado período");
        System.out.println("---------------------------------------------------------\n");

        int num_cri = 0;
        int i = 0;
        String sexo = null;
        int total_m = 0;
        int total_f = 0;
        int meses = 0;
        int tot_24 = 0;
        int perc_m = 0;
        int perc_f = 0;
        int perc_24 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de crianças nascidas no período: ");
        num_cri = sc.nextInt();
        System.out.println(" ");

        for (i = 0; i < num_cri; i++) {
            System.out.println("Digite o sexo da " + (i + 1) + "ª criança nascida (M ou F): ");
            sexo = sc.next(); 
            System.out.println("Digite o tempo de vida da " + (i + 1) + "ª criança nascida (em meses): ");
            meses = sc.nextInt();
            sc.nextLine(); 
            System.out.println(" ");

            if (sexo.equals("M")) { //"Para comparar strings pelo seu conteúdo em Java, é necessário usar o método equals(), que compara o conteúdo das strings e retorna true se forem iguais."
    		total_m = total_m + 1;
                
            }
            if (sexo.equals("F")) {
                total_f = total_f + 1;
            }
            if (meses <= 24) {
                tot_24 = tot_24 + 1;

            }
        }

        if (num_cri == 0) {
            perc_m = 0;
            perc_f = 0;
            perc_24 = 0;
        } else {
            perc_m = total_m * 100 / num_cri;
            perc_f = total_f * 100 / num_cri;
            perc_24 = tot_24 * 100 / num_cri;
        }

        System.out.println("A porcentagem de crianças do sexo masculino mortas no período é de " + perc_m + "%");
        System.out.println("A porcentagem de crianças do sexo feminino mortas no período é de " + perc_f + "%");
        System.out.println("A porcentagem de crianças que viveram 24 meses ou menos no período é de " + perc_24 + "%");

    }
}

		 
