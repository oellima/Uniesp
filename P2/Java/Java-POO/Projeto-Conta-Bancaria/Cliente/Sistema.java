package ProjetoContaBancaria.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public Sistema() {
    }

    public static void main(String[] args) {
        boolean encontrado = false;
        Scanner input = new Scanner(System.in);
        ArrayList clientes = new ArrayList();

        while(true) {
            while(true) {
                System.out.println("\n:: S I S T E M A   B A N C Á R I O ::\n");
                System.out.println("Bem-vindo(a) ao sistem. Escolha a opção desejada");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Consulta Saldo");
                System.out.println("3 - Realizar Saque");
                System.out.println("4 - Realizar Depósito");
                System.out.println("5 - Sair");
                System.out.print("Sua opção: ");
                int opcao = Integer.parseInt(input.nextLine());
                String cpfPesquisa;
                int i;
                double valorSaque;
                switch(opcao) {
                    case 1:
                        System.out.print("\nNome: ");
                        String nome = input.nextLine();
                        System.out.print("CPF: ");
                        String cpf = input.nextLine();
                        Cliente c = new Cliente(nome, cpf, 0.0D);
                        clientes.add(c);
                        System.out.println("\nO cliente foi cadastrado com sucesso.\n");
                        break;
                    case 2:
                        System.out.print("\nInforme o CPF do cliente: ");
                        cpfPesquisa = input.nextLine();
                        i = 0;

                        for(; i < clientes.size(); ++i) {
                            if (((Cliente)clientes.get(i)).getCpf().equals(cpfPesquisa)) {
                                encontrado = true;
                                System.out.println("\nNome: " + ((Cliente)clientes.get(i)).getNome());
                                System.out.println("CPF: " + ((Cliente)clientes.get(i)).getCpf());
                                System.out.println("Saldo: R$ " + ((Cliente)clientes.get(i)).getSaldoDisponivel());
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\nO cliente não foi encontrado.\n");
                        }
                        break;
                    case 3:
                        System.out.print("\nInforme o CPF do cliente: ");
                        cpfPesquisa = input.nextLine();

                        for(i = 0; i < clientes.size(); ++i) {
                            if (((Cliente)clientes.get(i)).getCpf().equals(cpfPesquisa)) {
                                encontrado = true;
                                System.out.print("Informe o valor do saque para o cliente " + ((Cliente)clientes.get(i)).getNome() + ": ");
                                valorSaque = Double.parseDouble(input.nextLine());
                                if (valorSaque <= ((Cliente)clientes.get(i)).getSaldoDisponivel()) {
                                    ((Cliente)clientes.get(i)).setSaldoDisponivel(((Cliente)clientes.get(i)).getSaldoDisponivel() - valorSaque);
                                    System.out.println("\nSaque efetuado com sucesso.\n");
                                } else {
                                    System.out.println("\nSaldo indisponível para este saque.\n");
                                }
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\nO cliente não foi encontrado.\n");
                        }
                        break;
                    case 4:
                        System.out.print("\nInforme o CPF do cliente: ");
                        cpfPesquisa = input.nextLine();

                        for(i = 0; i < clientes.size(); ++i) {
                            if (((Cliente)clientes.get(i)).getCpf().equals(cpfPesquisa)) {
                                encontrado = true;
                                System.out.print("Informe o valor do depósito para o cliente " + ((Cliente)clientes.get(i)).getNome() + ": ");
                                valorSaque = Double.parseDouble(input.nextLine());
                                ((Cliente)clientes.get(i)).setSaldoDisponivel(((Cliente)clientes.get(i)).getSaldoDisponivel() + valorSaque);
                                System.out.println("\nDepósito efetuado com sucesso.\n");
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\nO cliente não foi encontrado.\n");
                        }
                        break;
                    case 5:
                        System.out.println("\nObrigado por usar o Sistema Bancário\n");
                        System.exit(0);
                }
            }
        }
    }
}

