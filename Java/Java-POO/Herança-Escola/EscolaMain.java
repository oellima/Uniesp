package HerancaEscola;

import java.util.Date;

public class EscolaMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Jose Francisco", "123.456.789.00", new Date());
        System.out.println(aluno.nome);
        System.out.println(aluno.cpf);
        System.out.println(aluno.data_nascimento.toString());

        aluno.tirarCopia(3);
        Professor professor = new Professor("Thiago", "111.111.111-11", new Date());
        System.out.println(professor.tirarCopia(3));
    }
}
