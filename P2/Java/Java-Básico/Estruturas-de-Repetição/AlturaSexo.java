package Uniesp;

import java.util.Scanner;

public class AlturaSexo {

    public static void main(String[] args) {
        int sexo, quantidadeMulheres = 0, quantidadetHomens = 0;
        float altura, somaHoemns = 0, mediaHomens = 0, maior = 0, menor = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0 ; i < 10 ; i++) {

            System.out.print("Escolha o sexo da pessoa: 1 - Mulher, 2 - Homem): ");
            sexo = entrada.nextInt();
            System.out.print("Informe a altura: ");
            altura = entrada.nextFloat();


            if (sexo == 1) {
                quantidadeMulheres++;
            } else if (sexo == 2) {
                quantidadetHomens++;
                somaHoemns = somaHoemns + altura;
            } else {
                System.out.println("A opção informada do sexo é inválido!");
            }
            if (i == 0) {
                maior = altura;
                menor = altura;
            } else {
                if (altura > maior) {
                    maior = altura;
                } else if (altura < menor){
                    menor = altura;
                }
            }
        }
        mediaHomens = somaHoemns / quantidadetHomens;

        System.out.println("A maior altura regsitrada é de " + maior + " metros, e a menor é de " + menor + " metros");
        System.out.println("A média de altura dos homens é de " + mediaHomens + " metros");
        System.out.println("Número de mulheres registradas: " + quantidadeMulheres);

    }
}