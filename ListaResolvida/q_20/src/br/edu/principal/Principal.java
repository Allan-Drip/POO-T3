package br.edu.principal;
public class Principal {
    public static void main(String[] args) {
        int inicio = 50;
        int fim = 65;
        int incremento = 1;

        System.out.println("************************************************************************************");
        System.out.println("Tabela de graus Celsius e graus Fahrenheit, cujos graus variam de 50 a 65 de 1 cm 1.");
        System.out.println("************************************************************************************\n");


        for (int c = inicio; c <= fim; c += incremento) {
            double f = 1.8 * c + 32;
            System.out.printf("%d\t%.2f\n", c, f);
        }
    }
}
