package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int n = sc.nextInt();

        int[] serie = new int[n];
        serie[0] = 2;
        serie[1] = 7;
        serie[2] = 3;

        for (int i = 3; i < n; i++) {
            if (i % 3 == 0) {
                serie[i] = serie[i-1] * 3;
            } else if (i % 3 == 1) {
                serie[i] = serie[i-1] * 2;
            } else {
                serie[i] = serie[i-1] + serie[i-2] + serie[i-3];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(serie[i] + " ");
        }

        sc.close();
    }
}
