package HerancaEscola;

import java.util.Date;

public class Professor extends Pessoa {
    public Professor(String nome, String cpf, Date datanascimento) {
        super(nome, cpf, datanascimento);
    }
    public double salario;
    public String disciplina;
}
