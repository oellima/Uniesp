package Uniesp;

import java.util.Scanner;

public class LojaCd {

    public static void main(String[] args) {

        System.out.println("Tabela de cores dos CD's");
        System.out.println("1 - CD Verde" );
        System.out.println("2 - CD Azul" );
        System.out.println("3 - CD Amarelo" );
        System.out.println("4 - CD Vermelho" );

        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Informe a COR do CD para verificar o preço: ");
        str = texto.nextLine();
        System.out.println("A cor do CD escolhido foi: " + str);

        double cdVerde = 10.0, cdAzul = 20.0, cdAmarelo = 30.0, cdVermelho = 40.0;

        if (str.equals("verde")) {
            System.out.println("O valor desse Cd é: " + cdVerde + " reais" );
        } else if (str.equals("azul")) {
            System.out.println("O valor desse Cd é: " + cdAzul + " reais");
        } else if(str.equals("amarelo")){
            System.out.println("O valor desse Cd é: " + cdAmarelo + " reais");
        } else if (str.equals("vermelho")) {
            System.out.println("O valor desse Cd é: " + cdVermelho + " reais");
        } else {
            System.out.println("Cor inválida");
        }
    }
}
