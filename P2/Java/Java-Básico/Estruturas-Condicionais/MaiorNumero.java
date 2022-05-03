package Uniesp;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = leitor.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = leitor.nextInt();

        int maior;
        int menor;

        if(n3 > n2 && n3 > n1){
            maior = n3;

        } else if (n2 > n1 && n2 > n3) {
            maior = n2;

        } else {
            maior = n1;
        }

        if(n3 < n2 && n3 < n1){
            menor = n3;

        } else if (n2 < n1 && n2 < n3) {
            menor = n2;

        } else {
            menor = n1;
        }
        System.out.println("O menor número é: " + menor + "\nO maior número é: " + maior);
        leitor.close();
    }
}
