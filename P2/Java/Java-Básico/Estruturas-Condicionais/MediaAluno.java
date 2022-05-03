package Uniesp;

import java.util.Scanner;
class MediaAluno {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;
        double mediaProvaFinalPassar = 10 - media;
        double mediaRecuperacaoPassar = 10 - media + 2;

        System.out.println ("A media do aluno é: " +media);
        if((media >= 7) && (media <= 10)){
            System.out.println("O aluno foi aprovado!");
        }
        else if((media >= 0) && (media <= 4.9)){
            System.out.println("O aluno está de recuperacao!");
            System.out.println ("Para passar na recuperação o aluno deverá tirar a nota " + mediaRecuperacaoPassar);
        }
        else{
            System.out.println ("O aluno está na prova final!");
            System.out.println ("Para passar na prova final o aluno deverá tirar a nota " + mediaProvaFinalPassar);
        }
    }
}