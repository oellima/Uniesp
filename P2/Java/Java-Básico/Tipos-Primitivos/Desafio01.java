package Uniesp;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {

        String nome = "Leandro de Souza Lima de Almeida";
        String curso = "Sistemas para Internet";
        int periodo = 2;
        double nota1 = 9;
        double nota2 = 9.5;
        float faltas = 0;

        double mediaNotas = (nota1 + nota2) / 2;

        System.out.println("Nome completo: " + nome + "\nNome do curso: " + curso + "\nperíodo: " + periodo);
        System.out.println("Valor da primeira nota: " + nota1 + "\nValor da segunda nota: " + nota2 + "\nQuantidades de faltas: " + faltas);
        System.out.println("A média das duas notas é de: " + mediaNotas);
    }
}
