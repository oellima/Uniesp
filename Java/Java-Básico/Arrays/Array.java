package Uniesp;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valores[] = new int[10];
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valores[i] = Integer.parseInt(entrada.nextLine());
        }

        System.out.println("\nOs valores informados foram: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + "  ");
        }

        int maior = valores[0], menor = valores[0];
        for (int i = 0; i < valores.length; i++) {
            // Maior valor
            if (valores[i] > maior) {
                maior = valores[i];
            }

            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        int par = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                par += valores[i];
            }
        }
                System.out.println("\n\nO maior valor é: " + maior);
                System.out.println("O menor valor é: " + menor);
                System.out.println("A soma de todos os números é: " + soma);
                System.out.println("A soma de todos os números pares é: " + par);
            }
        }

