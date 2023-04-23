package br.edu.principal;
public class Principal {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        
        System.out.println("**************************************************");
        System.out.println("Os oitos primeiros termos da seguêcia de Fibonacci");
        System.out.println("**************************************************\n");

        System.out.print(num1 + "-" + num2);

        for (int i = 2; i < 8; i++) {
            int num3 = num1 + num2;
            System.out.print("-" + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
