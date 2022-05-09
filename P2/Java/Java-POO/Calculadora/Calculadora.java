package Uniesp;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.maiorMenor(3);
    }

    public void maiorMenor(int qtd) {

        Scanner leitor = new Scanner(System.in);
        int n;
        int maior = 0;
        int menor = 0;

        for( int i = 0; i < qtd; i++ ) {

            System.out.println("Digite o número " + (i + 1) + ":");
            n = leitor.nextInt();

            if (i == 0) {
                maior = n;
                menor = n;
            }

            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }
        System.out.println("O maior número é: " + maior + "\nO menor número é: " + menor);
        leitor.close();
    }

}
