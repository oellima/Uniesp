package Uniesp;

import java.util.*;

public class ParOuImpar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um valor de número inteiro: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.print("Você informou um numero par");
        }
        else{
            System.out.print("Você informou um numero impar");
        }
    }
}