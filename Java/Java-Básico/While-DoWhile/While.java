package Uniesp;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tentativas = 0;
        int numeroLido;
        boolean acertou = false;

        int numero = (int)(Math.random() * 11);

        while(!acertou){
            System.out.print("Informe um número de 0 a 20: ");
            numeroLido = Integer.parseInt(entrada.nextLine());
            tentativas++;

            if(numeroLido == numero){
                System.out.println("Você acertou em " + tentativas + " tentativas.");
                acertou = true;
            }
            else if(numeroLido < numero){
                System.out.println("Você errou! Tente um número maior.");
            }
            else{
                System.out.println("Você errou! Tente um número menor.");
            }
        }
    }
}
